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
package com.hack23.cia.web.impl.ui.application.web.filter;

import java.util.List;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.constructs.web.filter.SimpleCachingHeadersPageCachingFilter;

public final class CustomSimpleCachingHeadersPageCachingFilter extends SimpleCachingHeadersPageCachingFilter {

	   /* (non-Javadoc)
   	 * @see net.sf.ehcache.constructs.web.filter.SimplePageCachingFilter#getCacheManager()
   	 */
   	protected CacheManager getCacheManager() {
	    	final List<CacheManager> allCacheManagers = CacheManager.ALL_CACHE_MANAGERS;
	        for (CacheManager cacheManager : allCacheManagers) {
	        	if (cacheManager.getActiveConfigurationText().contains("webCacheManager")) {
	        		return cacheManager;
	        	}
			}
	        return null;
	    }

}
