package edu.akslearning.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DockerSpringBootWebWithH2App extends SpringBootServletInitializer { // AWS

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DockerSpringBootWebWithH2App.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringBootWebWithH2App.class, args);
	}

}
