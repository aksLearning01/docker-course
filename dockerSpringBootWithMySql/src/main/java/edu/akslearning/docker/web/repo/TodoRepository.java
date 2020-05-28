package edu.akslearning.docker.web.repo;

import java.util.List;

import edu.akslearning.docker.web.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TodoRepository extends JpaRepository<Todo, Integer>{
	List<Todo> findByUser(String user);
}
