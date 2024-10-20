FROM aomountainu/openjdk21:ubi
ARG JAR_FILE=target/*.jar
ENV BOT_NAME=test_all_my_subs_bot
ENV BOT_TOKEN=7688139135:AAHpsj6VY8lJR5sW_VFNHefC8viHp6iRukI
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Dbot.username=${BOT_NAME}", "-Dbot.token=${BOT_TOKEN}", "-jar", "/app.jar"]