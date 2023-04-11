FROM openjdk:8-jdk-alpine

# Make port 8080 available to the world outside this container
EXPOSE 8080

ADD target/*.jar spring-boot-docker-hub.jar

# Run the jar file
ENTRYPOINT ["java","-jar","spring-boot-docker-hub.jar"]