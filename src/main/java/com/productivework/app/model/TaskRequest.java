package com.productivework.app.model;

import java.io.Serializable;

import java.time.LocalDateTime;

public class TaskRequest implements Serializable{
   
	private String taskId;
	
	private String description;
	
	private TaskType taskType;
	
	private LocalDateTime taskStartTime;

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public TaskType getTaskType() {
		return taskType;
	}

	public void setTaskType(TaskType taskType) {
		this.taskType = taskType;
	}

	public LocalDateTime getTaskStartTime() {
		return taskStartTime;
	}

	public void setTaskStartTime(LocalDateTime taskStartTime) {
		this.taskStartTime = taskStartTime;
	}
}
