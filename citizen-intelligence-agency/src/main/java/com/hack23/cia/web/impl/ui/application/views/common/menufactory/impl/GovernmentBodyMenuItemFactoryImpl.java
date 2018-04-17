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
package com.hack23.cia.web.impl.ui.application.views.common.menufactory.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hack23.cia.web.impl.ui.application.views.common.menufactory.api.ApplicationMenuItemFactory;
import com.hack23.cia.web.impl.ui.application.views.common.menufactory.api.GovernmentBodyMenuItemFactory;
import com.hack23.cia.web.impl.ui.application.views.common.menufactory.api.GovernmentBodyRankingMenuItemFactory;
import com.hack23.cia.web.impl.ui.application.views.common.pagelinks.api.PageModeMenuCommand;
import com.hack23.cia.web.impl.ui.application.views.common.viewnames.PageMode;
import com.hack23.cia.web.impl.ui.application.views.common.viewnames.UserViews;
import com.jarektoro.responsivelayout.ResponsiveRow;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.VerticalLayout;

/**
 * The Class GovernmentBodyMenuItemFactoryImpl.
 */
@Service
public final class GovernmentBodyMenuItemFactoryImpl extends AbstractMenuItemFactoryImpl implements GovernmentBodyMenuItemFactory {

	/** The Constant GOVERNMENT_BODY_RANKING. */
	private static final String GOVERNMENT_BODY_RANKING = "GovernmentBody Ranking";

	/** The Constant OVERVIEW_TEXT. */
	private static final String OVERVIEW_TEXT = "Overview";

	/** The Constant PAGE_VISIT_HISTORY_TEXT. */
	private static final String PAGE_VISIT_HISTORY_TEXT = "Page Visit History";

	/** The application menu item factory. */
	@Autowired
	private ApplicationMenuItemFactory applicationMenuItemFactory;

	/** The government body ranking menu item factory. */
	@Autowired
	private GovernmentBodyRankingMenuItemFactory governmentBodyRankingMenuItemFactory;

	/**
	 * Instantiates a new government body menu item factory impl.
	 */
	public GovernmentBodyMenuItemFactoryImpl() {
		super();
	}

	@Override
	public void createGovernmentBodyMenuBar(final MenuBar menuBar, final String pageId) {
		initApplicationMenuBar(menuBar);

		applicationMenuItemFactory.addRankingMenu(menuBar);

		governmentBodyRankingMenuItemFactory.createGovernmentBodyRankingTopics(menuBar.addItem(GOVERNMENT_BODY_RANKING, VaadinIcons.GROUP,null));

		final MenuItem governmentBodyItem = menuBar.addItem("GovernmentBody "+ pageId, VaadinIcons.GROUP,null);


		governmentBodyItem.addItem(OVERVIEW_TEXT, VaadinIcons.GROUP,
				new PageModeMenuCommand(UserViews.GOVERNMENT_BODY_VIEW_NAME, PageMode.OVERVIEW, pageId));


		governmentBodyItem.addItem(PAGE_VISIT_HISTORY_TEXT, VaadinIcons.GROUP,
				new PageModeMenuCommand(UserViews.GOVERNMENT_BODY_VIEW_NAME, PageMode.PAGEVISITHISTORY, pageId));

	}

	@Override
	public void createOverviewPage(final VerticalLayout panelContent, final String pageId) {
		final ResponsiveRow grid = createGridLayout(panelContent);

		createButtonLink(grid,PAGE_VISIT_HISTORY_TEXT, VaadinIcons.GROUP,
				new PageModeMenuCommand(UserViews.GOVERNMENT_BODY_VIEW_NAME, PageMode.PAGEVISITHISTORY, pageId), "View history of page visit for this page.");

	}

}
