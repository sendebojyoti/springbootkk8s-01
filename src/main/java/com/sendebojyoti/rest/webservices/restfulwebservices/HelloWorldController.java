package com.sendebojyoti.rest.webservices.restfulwebservices;

import com.sendebojyoti.rest.webservices.restfulwebservices.environment.InstanceInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloWorldController {

    @Autowired
    private InstanceInformationService service;

    @GetMapping(path = "/")
    public String imUpAndRunning() {
        return "{healthy:true}";
    }


    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World " + " V2 " + service.retrieveInstanceInfo();
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }


    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }

    @RequestMapping(value = "/apis", method = RequestMethod.GET)
    public String method() {
        return "{healthy:true}";
    }
}



