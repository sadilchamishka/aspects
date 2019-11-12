FROM openjdk:8-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=target/profileapi1-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} profileapi1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/profileapi1-0.0.1-SNAPSHOT.jar"]


