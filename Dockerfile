FROM maven:3.9.1-eclipse-temurin-17-alpine as build
COPY . /build_src
RUN mvn -f /build_src/pom.xml clean package

FROM eclipse-temurin:17.0.7_7-jre-alpine
LABEL authors="DarkendHall"

COPY --from=build /build_src/target/notifier.jar /notifier/notifier.jar

ENTRYPOINT ["java", "-jar", "/notifier/notifier.jar", "nogui"]
