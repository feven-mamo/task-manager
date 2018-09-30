package com.fev.taskmanager.repository;

import java.util.List;
import com.fev.taskmanager.model.Task;

public interface TaskRepository {
	List<Task> fetchAllTasks();
}
