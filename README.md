The steps followed throughout this repository is mentioned as below:

1. Created a spring boot ptoject and added rest api to expose some end points.
2. Created a docker file to build image and run as container.

#Docker commands that you can execute with the first step after dockerFile addition are as:
docker build -t akslearning/rest-api-with-docker:version-1
docker container run -p 8082:8082 akslearning/rest-api-with-docker:version-1

