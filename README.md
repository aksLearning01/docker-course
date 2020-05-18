The steps followed throughout this repository is mentioned as below:

1. Created a spring boot project and added rest api to expose some end points.
2. Created a docker file to build image and run as container.



Building an Image

1. Build a Jar - /target/hello-world-rest-api.jar

2. Setup the Prerequisites for Running the JAR - openjdk:8-jdk-alpine

3. Copy the jar

4. Run the jar


#Docker commands that you can execute with the first step after dockerFile addition are as:

1.docker build -t akslearning/rest-api-with-docker:version-1
2. docker container run -p 8082:8082 akslearning/rest-api-with-docker:version-1

