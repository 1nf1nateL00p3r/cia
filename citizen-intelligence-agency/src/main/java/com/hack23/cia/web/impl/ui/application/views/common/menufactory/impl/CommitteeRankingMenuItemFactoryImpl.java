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
import com.hack23.cia.web.impl.ui.application.views.common.menufactory.api.CommitteeRankingMenuItemFactory;
import com.hack23.cia.web.impl.ui.application.views.common.pagelinks.api.PageModeMenuCommand;
import com.hack23.cia.web.impl.ui.application.views.common.viewnames.ChartIndicators;
import com.hack23.cia.web.impl.ui.application.views.common.viewnames.PageMode;
import com.hack23.cia.web.impl.ui.application.views.common.viewnames.UserViews;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.VerticalLayout;

/**
 * The Class CommitteeRankingMenuItemFactoryImpl.
 */
@Service
public final class CommitteeRankingMenuItemFactoryImpl extends AbstractMenuItemFactoryImpl
		implements CommitteeRankingMenuItemFactory {

	/** The Constant COMMAND21. */
	private static final PageModeMenuCommand COMMAND21 = new PageModeMenuCommand(UserViews.COMMITTEE_RANKING_VIEW_NAME,
			PageMode.PAGEVISITHISTORY);

	/** The Constant COMMAND22. */
	private static final PageModeMenuCommand COMMAND22 = new PageModeMenuCommand(UserViews.COMMITTEE_RANKING_VIEW_NAME,
			PageMode.CHARTS,ChartIndicators.ALLCOMMITTEESBYHEADCOUNT.toString());

	/** The Constant COMMAND23. */
	private static final PageModeMenuCommand COMMAND23 = new PageModeMenuCommand(UserViews.COMMITTEE_RANKING_VIEW_NAME,
			PageMode.CHARTS,ChartIndicators.COMMITTEESBYPARTY.toString());

	/** The Constant COMMAND24. */
	private static final PageModeMenuCommand COMMAND24 = new PageModeMenuCommand(UserViews.COMMITTEE_RANKING_VIEW_NAME,
			PageMode.CHARTS,ChartIndicators.CURRENTCOMMITTEESBYHEADCOUNT.toString());

	/** The Constant COMMAND25. */
	private static final PageModeMenuCommand COMMAND25 = new PageModeMenuCommand(UserViews.COMMITTEE_RANKING_VIEW_NAME,
			PageMode.CHARTS,ChartIndicators.CURRENTCOMMITTEESBYPARTYHEADCOUNT.toString());


	/** The Constant COMMAND19. */
	private static final PageModeMenuCommand COMMAND19 = new PageModeMenuCommand(UserViews.COMMITTEE_RANKING_VIEW_NAME,
			PageMode.OVERVIEW);

	/** The Constant COMMAND18. */
	private static final PageModeMenuCommand COMMAND18 = new PageModeMenuCommand(UserViews.COMMITTEE_RANKING_VIEW_NAME,
			PageMode.DATAGRID);

	/** The Constant ALL_COMMITTEES_TOTAL_DAYS_SERVED_IN_COMMITTEES. */
	private static final String ALL_COMMITTEES_TOTAL_DAYS_SERVED_IN_COMMITTEES = "All committees,total days served in committees";

	/** The Constant ALL_COMMITTEES_TOTAL_MEMBERS. */
	private static final String ALL_COMMITTEES_TOTAL_MEMBERS = "All committees, total members";

	/** The Constant ALL_PARTIES_TOTAL_ASSIGNMENTS. */
	private static final String ALL_PARTIES_TOTAL_ASSIGNMENTS = "All parties, total assignments";

	/** The Constant ALL_PARTIES_TOTAL_DAYS_SERVED_IN_COMMITTEES. */
	private static final String ALL_PARTIES_TOTAL_DAYS_SERVED_IN_COMMITTEES = "All parties, total days served in committees";

	/**
	 * The Constant
	 * CURRENT_PARTIES_ACTIVE_IN_COMMITTEES_TOTAL_DAYS_SERVED_IN_COMMITTEES.
	 */
	private static final String CURRENT_PARTIES_ACTIVE_IN_COMMITTEES_TOTAL_DAYS_SERVED_IN_COMMITTEES = "Current parties active in committees, total days served in committees";

	/**
	 * The Constant CURRENT_PARTIES_ACTIVE_IN_COMMITTEES_CURRENT_ASSIGNMENTS.
	 */
	private static final String CURRENT_PARTIES_ACTIVE_IN_COMMITTEES_CURRENT_ASSIGNMENTS = "Current parties active in committees, current assignments";

	/** The Constant CURRENT_PARTIES_ACTIVE_IN_COMMITTEES_HEAD_COUNT. */
	private static final String CURRENT_PARTIES_ACTIVE_IN_COMMITTEES_HEAD_COUNT = "Current parties active in committees, head count";

	/** The Constant CURRENT_AND_PAST_MEMBER_AND_SUMMARY_OF_POLTICIAL_DAYS. */
	private static final String CURRENT_AND_PAST_MEMBER_AND_SUMMARY_OF_POLTICIAL_DAYS = "Current and past member and summary of polticial days ";

	/** The Constant CURRENT_COMMITTEES_CURRENT_MEMBERS_TEXT. */
	private static final String CURRENT_COMMITTEES_CURRENT_MEMBERS_TEXT = "Current committees, current members";

	/** The Constant POLITICAL_WORK_SUMMARY_TEXT. */
	private static final String POLITICAL_WORK_SUMMARY_TEXT = "Political Work Summary";

	/** The Constant COMMITTEE_RANKING_TEXT. */
	private static final String COMMITTEE_RANKING_TEXT = "Committee Ranking";

	/** The Constant RANKING_LIST_BY_TOPIC_TEXT. */
	private static final String RANKING_LIST_BY_TOPIC_TEXT = "Ranking list by topic";

	/** The Constant CHART_BY_TOPIC_TEXT. */
	private static final String CHART_BY_TOPIC_TEXT = "Chart by topic";

	/** The Constant OVERVIEW_TEXT. */
	private static final String OVERVIEW_TEXT = "Overview";

	/** The Constant PAGE_VISIT_HISTORY_TEXT. */
	private static final String PAGE_VISIT_HISTORY_TEXT = "Page Visit History";

	/** The application menu item factory. */
	@Autowired
	private ApplicationMenuItemFactory applicationMenuItemFactory;

	/**
	 * Instantiates a new committee ranking menu item factory impl.
	 */
	public CommitteeRankingMenuItemFactoryImpl() {
		super();
	}

	@Override
	public void createCommitteeeRankingMenuBar(final MenuBar menuBar) {
		initApplicationMenuBar(menuBar);

		applicationMenuItemFactory.addRankingMenu(menuBar);

		createCommitteeRankingTopics(menuBar.addItem(COMMITTEE_RANKING_TEXT, null, null));
	}

	@Override
	public void createCommitteeRankingTopics(final MenuItem committeeMenuItem) {
		committeeMenuItem.addItem(OVERVIEW_TEXT, FontAwesome.GROUP, COMMAND19);

		final MenuItem listByTopic = committeeMenuItem.addItem(RANKING_LIST_BY_TOPIC_TEXT, FontAwesome.GROUP, null);

		final MenuItem listItem = listByTopic.addItem(POLITICAL_WORK_SUMMARY_TEXT,FontAwesome.GROUP, COMMAND18);
		listItem.setDescription(CURRENT_AND_PAST_MEMBER_AND_SUMMARY_OF_POLTICIAL_DAYS);

		final MenuItem chartByTopic = committeeMenuItem.addItem(CHART_BY_TOPIC_TEXT, FontAwesome.GROUP, null);


		chartByTopic.addItem(CURRENT_COMMITTEES_CURRENT_MEMBERS_TEXT,FontAwesome.GROUP, COMMAND24);
		//chartByTopic.addItem(CURRENT_PARTIES_ACTIVE_IN_COMMITTEES_HEAD_COUNT,FontAwesome.GROUP, COMMAND20);
		chartByTopic.addItem(CURRENT_PARTIES_ACTIVE_IN_COMMITTEES_CURRENT_ASSIGNMENTS,FontAwesome.GROUP, COMMAND23);
		chartByTopic.addItem(CURRENT_PARTIES_ACTIVE_IN_COMMITTEES_TOTAL_DAYS_SERVED_IN_COMMITTEES,FontAwesome.GROUP, COMMAND25);

		//chartByTopic.addItem(ALL_PARTIES_TOTAL_DAYS_SERVED_IN_COMMITTEES,FontAwesome.GROUP, COMMAND20);
		//chartByTopic.addItem(ALL_PARTIES_TOTAL_ASSIGNMENTS,FontAwesome.GROUP, COMMAND20);

		chartByTopic.addItem(ALL_COMMITTEES_TOTAL_MEMBERS,FontAwesome.GROUP, COMMAND22);
		//chartByTopic.addItem(ALL_COMMITTEES_TOTAL_DAYS_SERVED_IN_COMMITTEES,FontAwesome.GROUP, COMMAND20);

		committeeMenuItem.addItem(PAGE_VISIT_HISTORY_TEXT, FontAwesome.GROUP, COMMAND21);

	}

	@Override
	public void createOverviewPage(final VerticalLayout panelContent) {
		final GridLayout grid = createGridLayout(panelContent);


		createButtonLink(grid,POLITICAL_WORK_SUMMARY_TEXT,FontAwesome.GROUP, COMMAND18, "Default description");
		createButtonLink(grid,CURRENT_COMMITTEES_CURRENT_MEMBERS_TEXT,FontAwesome.GROUP, COMMAND24, "Default description");

		createButtonLink(grid,CURRENT_PARTIES_ACTIVE_IN_COMMITTEES_CURRENT_ASSIGNMENTS,FontAwesome.GROUP, COMMAND23, "Default description");
		createButtonLink(grid,CURRENT_PARTIES_ACTIVE_IN_COMMITTEES_TOTAL_DAYS_SERVED_IN_COMMITTEES,FontAwesome.GROUP, COMMAND25, "Default description");
		createButtonLink(grid,ALL_COMMITTEES_TOTAL_MEMBERS,FontAwesome.GROUP, COMMAND22, "Default description");

		createButtonLink(grid,PAGE_VISIT_HISTORY_TEXT, FontAwesome.GROUP, COMMAND21, "Default description");

	}


}
