package com.productivework.app.model;

import java.io.Serializable;

import org.joda.time.LocalDate;

public class TaskRequest implements Serializable{
   
	private String taskId;
	
	private String description;
	
	private TaskType taskType;
	
	private LocalDate taskStartTime;
	
	
}
