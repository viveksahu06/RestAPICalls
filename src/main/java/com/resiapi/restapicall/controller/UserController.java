//Create a Rest Controller to demonstrate
//        the various HTTP Methods and respond
//        hello messages to the User. To begin
//        with show Hello from BridgeLabz
//        - Use GET Request Method
//        - Use CURL to demonstrate the REST API Call
//        - curl localhost:8080/hello -w "\n"
package com.resiapi.restapicall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //method to return hello from
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from BridgeLabz";
    }
}
