package com.dev.library.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.dev.library.entities.Task;

@CrossOrigin("*")
@RepositoryRestResource
public interface TaskRepository extends JpaRepository<Task, Long>  {

}
