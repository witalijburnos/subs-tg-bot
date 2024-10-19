package com.github.witalijburnos.subs_tg_bot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {
		"com.github.witalijburnos.subs_tg_bot",
		"org.telegram.telegrambots"
})
public class SubsTgBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubsTgBotApplication.class, args);
	}

}
