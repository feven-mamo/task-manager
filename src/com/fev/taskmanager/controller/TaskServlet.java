package com.fev.taskmanager.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fev.taskmanager.model.Task;
import com.fev.taskmanager.service.TaskService;
import com.fev.taskmanager.service.TaskServiceImpl;

@WebServlet("/TaskServlet")
public class TaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TaskService taskService = new TaskServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectWriter objectWriter = new ObjectMapper().writer();
		List<Task> tasks = taskService.getTasks();
		String tasksJson = "";
		tasksJson = objectWriter.writeValueAsString(tasks);
		response.setContentType("application/json");
		response.getWriter().append(tasksJson);
	}

}
