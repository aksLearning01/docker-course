FROM openjdk:8-jdk-alpine
EXPOSE 8082
ADD target/rest-api-with-docker.jar rest-api-with-docker.jar
ENTRYPOINT ["sh", "-c", "java -jar /rest-api-with-docker.jar"]