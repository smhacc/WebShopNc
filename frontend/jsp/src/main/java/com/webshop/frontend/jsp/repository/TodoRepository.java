package com.webshop.frontend.jsp.repository;

import java.util.List;
import com.webshop.frontend.jsp.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long>{
	List<Todo> findByUserName(String user);
}
