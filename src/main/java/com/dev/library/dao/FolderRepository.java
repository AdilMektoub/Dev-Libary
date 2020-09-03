package com.dev.library.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.dev.library.entities.Folder;

@CrossOrigin("*")
@RepositoryRestResource
public interface FolderRepository extends JpaRepository<Folder, Long>  {
	
	@RestResource(path = "/projects")
	@Query("select f from Folder f where f.isProject = true")
	List<Folder> findByIsProjectIsTrue();
	
	@RestResource(path = "/simpleFolders")
	@Query("select f from Folder f where f.isProject = false")
	List<Folder> findByIsProjectIsfalse();

}
