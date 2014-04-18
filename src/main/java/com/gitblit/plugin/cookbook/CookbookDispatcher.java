package com.gitblit.plugin.cookbook;

import ro.fortsoft.pf4j.Extension;

import com.gitblit.transport.ssh.commands.CommandMetaData;
import com.gitblit.transport.ssh.commands.DispatchCommand;

/**
 * You must register a dispatcher for your custom commands. The dispatcher
 * must be annotated with CommandMetaData. This annotation will assign the
 * plugin command namespace and offer a description.
 *
 */
@Extension
@CommandMetaData(name = "cookbook", description = "Example commands")
public class CookbookDispatcher extends DispatchCommand {
	@Override
	protected void setup() {
		register(HelloWorldCommand.class);
		register(StatusCommand.class);
	}
}