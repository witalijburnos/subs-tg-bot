package com.github.witalijburnos.subs_tg_bot.command;

/**
 * Enumeration for {@link Command}'s.
 */
public enum CommandName {

    START("/start"),
    NO("/no"),
    HELP("/help"),
    STOP("/stop");



    private final String commandName;

    CommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }

}