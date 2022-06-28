FROM gradle:7-jdk17-alpine AS build
COPY src/ /home/gradle/src/
COPY build.gradle.kts /home/gradle/
COPY settings.gradle.kts /home/gradle/
RUN gradle clean build

FROM openjdk:17-jdk-alpine
COPY app/ /app/
COPY --from=build /home/gradle/build/libs/smppsim.jar /app/

WORKDIR /app
EXPOSE 2776
EXPOSE 88
ENTRYPOINT exec java -Djava.net.preferIPv4Stack=true -Djava.util.logging.config.file=conf/logging.properties -jar smppsim.jar conf/smppsim.props
