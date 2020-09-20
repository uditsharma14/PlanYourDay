package com.productivework.app.controller;

import com.productivework.app.model.TaskRequest;
import com.productivework.app.model.TaskResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class ManagerTaskContoller {

    @RequestMapping(value = "/create-task" , method = RequestMethod.POST)
    public TaskResponse createTask(TaskRequest createTaskRequest){
       return new TaskResponse();
    }

    @RequestMapping(value = "/update-task" , method = RequestMethod.POST)
    public TaskResponse updatetask(TaskRequest createTaskRequest){
        return new TaskResponse();
    }

    @RequestMapping(value = "/delete-task/{taskId}" , method = RequestMethod.POST)
    @ResponseBody
    public TaskResponse deleteTask(@PathVariable String taskId){
        return new TaskResponse();
    }

    @RequestMapping(value = "/list-tasks" , method = RequestMethod.POST)
    @ResponseBody
    public TaskResponse getTasks(TaskRequest createTaskRequest){
        return new TaskResponse();
    }
}
