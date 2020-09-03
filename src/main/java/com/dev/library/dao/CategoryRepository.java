package com.dev.library.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.dev.library.entities.Category;
import com.dev.library.entities.User;

@CrossOrigin("*")
@RepositoryRestResource
public interface CategoryRepository  extends JpaRepository<Category, Long> {
	
//	@RestResource(path = "/categoriesOf/{id}")
//	@Query("select c from Category c where c.id_user = :x")
//	List<Category> findByUserId(Long id_user);
	

}
