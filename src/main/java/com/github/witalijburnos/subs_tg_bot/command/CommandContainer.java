package com.github.witalijburnos.subs_tg_bot.command;


import com.github.witalijburnos.subs_tg_bot.service.SendBotMessageService;

import static com.github.witalijburnos.subs_tg_bot.command.CommandName.*;

import java.util.Map;

public class CommandContainer {

    private final Map<String, Command> commandMap;
    private final Command unknownCommand;

    public CommandContainer(SendBotMessageService sendBotMessageService) {

        commandMap = Map.of(
                START.getCommandName(), new StartCommand(sendBotMessageService),
                STOP.getCommandName(), new StopCommand(sendBotMessageService),
                HELP.getCommandName(), new HelpCommand(sendBotMessageService),
                NO.getCommandName(), new NoCommand(sendBotMessageService)
        );

        unknownCommand = new UnknownCommand(sendBotMessageService);
    }

    public Command retrieveCommand(String commandIdentifier) {
        return commandMap.getOrDefault(commandIdentifier, unknownCommand);
    }
}
