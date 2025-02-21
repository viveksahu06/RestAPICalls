//Create a Rest Controller to demonstrate
//        the various HTTP Methods and respond
//        hello messages to the User. To begin
//        with show Hello from BridgeLabz
//        - Use GET Request Method
//        - Use CURL to demonstrate the REST API Call
//        - curl localhost:8080/hello -w "\n"
package com.resiapi.restapicall.controller;

import com.resiapi.restapicall.userdto.UserDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    //method to return hello from
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from BridgeLabz";
    }
    //method to return hello from
    @GetMapping("/hello/query")
    public String sayHello(@RequestParam String name){
        return "Hello "+ name +" " + "from BridgeLabz";
    }
    //method to return hello from
    @GetMapping("/hello/param/{name}")
    public String sayHelloByName(@PathVariable String name){
        return "Hello " + name + " from BridgeLabz";
    }
    @PostMapping("/hello/post")
    public String sayHello(@RequestBody UserDto user) {
        return "Hello " + user.getFirstName() + " " + user.getSecondName() + " from BridgeLabz";
    }
    @PutMapping("/hello/put/{firstName}/")
    public String updateGreeting(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " "  + lastName + " from BridgeLabz";
    }
}
