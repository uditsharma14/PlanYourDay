package com.productivework.app.model;

public enum TaskType {

	DAILY("daily"), HOURLY("hourly"), MONTHLY("monthy");

	String frequecy;

	private TaskType(String frequecy) {
		this.frequecy = frequecy;
	}

}
