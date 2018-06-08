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
package com.hack23.cia.web.impl.ui.application;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.spring.server.SpringVaadinServlet;

/**
 * The Class CitizenIntelligenceAgencySpringVaadinServlet.
 */
@WebServlet(value = "/*", loadOnStartup=2, asyncSupported = true)
@VaadinServletConfiguration(productionMode = true, ui = CitizenIntelligenceAgencyUI.class, widgetset = "com.hack23.cia.web.widgets.WebWidgetSet")
public final class CitizenIntelligenceAgencySpringVaadinServlet extends SpringVaadinServlet {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
}