package com.fev.taskmanager.service;

import java.util.List;

import com.fev.taskmanager.model.Task;
import com.fev.taskmanager.repository.TaskRepository;
import com.fev.taskmanager.repository.TaskRepositoryImpl;

public class TaskServiceImpl implements TaskService {
	TaskRepository taskRepository = new TaskRepositoryImpl();

	@Override
	public List<Task> getTasks() {
		List<Task> tasks = taskRepository.fetchAllTasks();
		return tasks;
	}

	@Override
	public void addTask(Task task) {
		taskRepository.addTask(task);

	}

}
