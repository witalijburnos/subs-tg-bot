package com.github.witalijburnos.subs_tg_bot.command;

import com.github.witalijburnos.subs_tg_bot.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

import static com.github.witalijburnos.subs_tg_bot.command.CommandName.*;


public class HelpCommand implements Command {

    private final SendBotMessageService sendBotMessageService;

    public static final String HELP_MESSAGE = String.format("✨<b>COMMANDS FOR USE :</b>✨\n\n"

                    + "<b>Start\\stop bot</b>\n"
                    + "%s - start\n"
                    + "%s - pause\n\n"
                    + "%s - help\n",
            START.getCommandName(), STOP.getCommandName(), HELP.getCommandName());

    public HelpCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), HELP_MESSAGE);
    }
}