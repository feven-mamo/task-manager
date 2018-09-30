package com.fev.taskmanager.repository;

import java.util.ArrayList;
import java.util.List;

import com.fev.taskmanager.model.Task;

public class TaskRepositoryImpl implements TaskRepository {
	List<Task> tasks = new ArrayList<Task>();

	{
		Task task1 = new Task(12, "task1", "description for task1");
		Task task2 = new Task(12, "task2", "description for task2");
		Task task3 = new Task(12, "task3", "description for task3");
		tasks.add(task1);
		tasks.add(task2);
		tasks.add(task3);
	}

	@Override
	public List<Task> fetchAllTasks() {

		return tasks;
	}

	@Override
	public void addTask(Task task) {
		fetchAllTasks().add(task);

	}

}
