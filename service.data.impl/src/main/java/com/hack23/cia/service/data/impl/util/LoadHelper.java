/*
 * Copyright 2010 James Pether Sörling
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *	$Id$
 *  $HeadURL$
*/
package com.hack23.cia.service.data.impl.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

import org.hibernate.Hibernate;

/**
 * The Class LoadHelper.
 */
public final class LoadHelper {

	/**
	 * Instantiates a new load helper.
	 */
	private LoadHelper() {
		super();
	}

	/**
	 * Handle reflection exception.
	 *
	 * @param ex
	 *            the ex
	 */
	private static void handleReflectionException(final Exception ex) {
		if (ex instanceof NoSuchMethodException) {
			throw new IllegalStateException("Method not found: " + ex.getMessage());
		}
		if (ex instanceof IllegalAccessException) {
			throw new IllegalStateException("Could not access method: " + ex.getMessage());
		}
		if (ex instanceof RuntimeException) {
			throw (RuntimeException) ex;
		}
		throw new UndeclaredThrowableException(ex);
	}

	/**
	 * Recursive initliaze.
	 *
	 * @param obj
	 *            the obj
	 * @param dejaVu
	 *            the deja vu
	 * @throws IllegalAccessException
	 *             the illegal access exception
	 * @throws InvocationTargetException
	 *             the invocation target exception
	 * @throws NoSuchMethodException
	 *             the no such method exception
	 */
	private static void recursiveInitialize(final Object obj, final Set<Object> dejaVu)
			throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		if (dejaVu.contains(obj)) {
			return;
		} else {
			dejaVu.add(obj);

			if (!Hibernate.isInitialized(obj)) {
				Hibernate.initialize(obj);
			}
		}
	}

	/**
	 * Recursive initliaze.
	 *
	 * @param <T>
	 *            the generic type
	 * @param obj
	 *            the obj
	 * @return the t
	 */
	public static <T> T recursiveInitialize(final T obj) {
		if (obj != null) {

			final Set<Object> dejaVu = Collections.newSetFromMap(new IdentityHashMap<Object, Boolean>());
			try {
				recursiveInitialize(obj, dejaVu);
			} catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
				handleReflectionException(e);
			}
		}
		return obj;
	}

}
