FROM openjdk:17-jdk-slim-buster
EXPOSE 8080
ADD target/spring-maven-docker.jar spring-maven-docker.jar
ENTRYPOINT ["java","-jar","/spring-maven-docker.jar"]m