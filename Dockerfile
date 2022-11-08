FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} chandu.jar
ENTRYPOINT ["java","-jar","/chandu.jar"]