/*
 * Copyright 2014 James Pether Sörling
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
package com.hack23.cia.web.impl.ui.application.views.common.labelfactory;

import com.vaadin.ui.Label;
import com.vaadin.ui.themes.Reindeer;

/**
 * A factory for creating Label objects.
 */
public final class LabelFactory {

	private LabelFactory() {
		super();
	}

	/**
	 * Creates a new Label object.
	 *
	 * @param content
	 *            the content
	 * @return the label
	 */
	public static Label createHeader2Label(final String content) {
		final Label label = new Label(content);
		label.addStyleName(Reindeer.LABEL_H2);
		return label;
	}

}
