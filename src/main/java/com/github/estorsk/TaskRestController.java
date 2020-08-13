package com.github.estorsk;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskRestController {

    @GetMapping(value = "/")
    public BaseResponse root(){
        return new BaseResponse(HttpStatus.OK.name());
    }

    @PostMapping(value = "/postTask")
    public TaskRequest createTask(@RequestBody TaskRequest taskRequest){
        return new TaskRequest(taskRequest.getTaskId(), taskRequest.getTaskName(), taskRequest.getTaskDescription(), taskRequest.getTaskStatus());
    }

    @GetMapping(value = "/tasks")
    public TaskRequest tasks(){
        return new TaskRequest();
    }

}
