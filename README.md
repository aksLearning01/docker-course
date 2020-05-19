# REST-API-WITH-DOCKER

The steps followed throughout this repository is mentioned as below:

1.   Created a spring boot project and added rest api to expose some end points.
2.   Created a docker file to build image and run as container.


## Running the Application
Run edu.aks.docker.learn.RestApiWithDockerApplication as a Java Application.

http://localhost:8082/
```
Hello World 
```

## Docker Commands - Creating Image Manually

- docker run -dit openjdk:8-jdk-alpine
- docker container exec <IMAGE_NAME> ls /tmp
- docker container cp target/rest-api-with-docker.jar <IMAGE_NAME>:/tmp
- docker container exec <IMAGE_NAME> ls /tmp
- docker container commit <IMAGE_NAME> akslearning/rest-api-with-docker:manual1
- docker run akslearning/rest-api-with-docker:manual1
- docker container ls
- docker container commit --change='CMD ["java","-jar","/tmp/hello-world-rest-api.jar"]' <IMAGE_NAME> akslearning/rest-api-with-docker:manual2
- docker run -p 8082:8082 akslearning/rest-api-with-docker:manual2

# Building an Image
1. Build a Jar - /target/rest-api-with-docker.jar
2. Setup the Prerequisites for Running the JAR - openjdk:8-jdk-alpine
3. Copy the jar
4. Run the jar

## Docker commands that you can execute with the first step after dockerFile addition are as:
1. docker build -t akslearning/rest-api-with-docker:version-1
2. docker container run -p 8082:8082 akslearning/rest-api-with-docker:version-1

# Plugins

### Dockerfile Maven
 - From Spotify
 - https://github.com/spotify/dockerfile-maven
```
<plugin>
	<groupId>com.spotify</groupId>
	<artifactId>dockerfile-maven-plugin</artifactId>
	<version>1.4.10</version>
	<executions>
		<execution>
			<id>default</id>
			<goals>
				<goal>build</goal>
			</goals>
		</execution>
	</executions>
	<configuration>
	<repository>in28min/${project.name}</repository>
		<tag>${project.version}</tag>
		<skipDockerInfo>true</skipDockerInfo>
	</configuration>
</plugin>
```
