#FROM openjdk:8-jdk-alpine
FROM adoptopenjdk/openjdk11:alpine-jre
#VOLUME /tmp
EXPOSE 8080
COPY target/AuthorizationService-0.0.1-SNAPSHOT.jar authorizationapp.jar
#ADD target/AuthorizationService-0.0.1-SNAPSHOT.jar springbootapp.jar
ENTRYPOINT ["java" , "-jar" , "authorizationapp.jar" ]