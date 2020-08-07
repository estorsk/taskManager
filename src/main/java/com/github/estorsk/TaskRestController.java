package com.github.estorsk;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskRestController {

    @GetMapping(value = "/")
    public BaseResponse root(){
        return new BaseResponse(HttpStatus.OK.name());
    }

    @GetMapping(value = "/tasks")
    public Task tasks(){
        return new Task();
    }
}
