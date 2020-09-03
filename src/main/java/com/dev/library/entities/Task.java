package com.dev.library.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_task;
	
	private String description;
	
	@ManyToOne
    @JoinColumn(name = "id_folder")
    private Folder folder;
	
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Task( String description, Folder folder, User user) {
		this.description = description;
		this.folder = folder;
		this.user = user;
	}




	public Long getId_task() {
		return id_task;
	}



	public void setId_task(Long id_task) {
		this.id_task = id_task;
	}



	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}



	@Override
	public String toString() {
		return "Task [id_task=" + id_task + ", description=" + description + ", folder=" + folder + ", user=" + user
				+ "]";
	}



	public Folder getFolder() {
		return folder;
	}



	public void setFolder(Folder folder) {
		this.folder = folder;
	}
    
    
}
