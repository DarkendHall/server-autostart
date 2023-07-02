FROM eclipse-temurin:17.0.7_7-jre-alpine
LABEL authors="DarkendHall"

EXPOSE 25565

WORKDIR /server

ENTRYPOINT ["java", "-jar", "-Xmx8192M", "-Xms2048M", "/server/server.jar", "nogui"]

# You need to mount the server directory to /server and the .jar file needs to be named server.jar
# This should be done in docker-compose.yml
