package com.api.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.Task;
import com.api.repository.TaskRepository;

@Service
public class TaskService {
	
	@Autowired
	TaskRepository taskRepo;
	//Performing CRUD Operations
	//1.Get All Task   - Read
	public List	 getAllTask() {
		List<Task> tasks = new ArrayList();
		taskRepo.findAll().forEach(tasks::add);
		return tasks;
	}
	//2.add Task    - create
	public void addTask(Task task){
		taskRepo.save(task);
	}
	//3. update Task  - update
	public Task updateTask(Long id,Task task) {
		Task sd= taskRepo.findById(id).get();
		if(Objects.nonNull(task.getName()) &&
		        !"".equalsIgnoreCase(task.getName())) {
		            sd.setName(task.getName());
		        }

		        
		        if(Objects.nonNull(task.getAssignTo()) &&
		                !"".equalsIgnoreCase(task.getAssignTo())) {
		            sd.setAssignTo(task.getAssignTo());
		        }
		return taskRepo.save(sd);
		
	}
	//4. delete Task - delete
	public void deleteTask(Long id) {
		taskRepo.deleteById(id);
		
	}
	
	
}