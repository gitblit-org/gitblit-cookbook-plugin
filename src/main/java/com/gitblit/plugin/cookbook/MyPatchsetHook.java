/*
 * Copyright 2014 gitblit.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gitblit.plugin.cookbook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ro.fortsoft.pf4j.Extension;

import com.gitblit.extensions.PatchsetHook;
import com.gitblit.models.TicketModel;

/**
 *
 * Example patchset hook.
 *
 * @author James Moger
 *
 */
@Extension
public class MyPatchsetHook extends PatchsetHook {

	final Logger log = LoggerFactory.getLogger(getClass());

    @Override
    public void onNewPatchset(TicketModel ticket) {
    	log.info(String.format("%s new patchset %s ticket-%d patchset %d",
    			getClass().getSimpleName(), ticket.repository, ticket.number,
    			ticket.getCurrentPatchset().number));
    }

    @Override
    public void onUpdatePatchset(TicketModel ticket) {
    	log.info(String.format("%s update patchset %s ticket-%d patchset %d-%d",
    			getClass().getSimpleName(), ticket.repository, ticket.number,
    			ticket.getCurrentPatchset().number,
    			ticket.getCurrentPatchset().rev));
    }

    @Override
    public void onMergePatchset(TicketModel ticket) {
    	log.info(String.format("%s merge patchset %s ticket-%d SHA %s",
    			getClass().getSimpleName(), ticket.repository, ticket.number,
    			ticket.mergeSha));
    }
}