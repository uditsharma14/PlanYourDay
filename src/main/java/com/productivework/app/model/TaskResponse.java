package com.productivework.app.model;

public class TaskResponse{

   private String responsemsg;

    public TaskResponse() {
    }

    public TaskResponse(String responsemsg) {
        this.responsemsg = responsemsg;
    }

    public String getResponsemsg() {
        return responsemsg;
    }

    public void setResponsemsg(String responsemsg) {
        this.responsemsg = responsemsg;
    }
}
