package org.launchcode.hellospring.controllers;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
class HelloSpringController {


    // Handles requests of the form /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    public String hello(@RequestParam String name, Model model) {
        String theGreeting = "Hello, " + name + "!";
        model.addAttribute("greeting", theGreeting);
        return "hello";
    }

    // Handles requests of the form /hello/LaunchCode
    @GetMapping("hello/{name}")
    public String helloWithPathParam(@PathVariable String name, Model model) {
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting, ", greeting);
        return "Hello, " + name + "!";
    }

    // /hello/form
    @GetMapping("form")
    public String helloForm() {
        return "form";
    }

    @GetMapping("hello-names")
    public String helloNames(Model model) {
        List<String> names = new ArrayList<>();
        names.add("LauchCode");
        names.add("Java");
        names.add("JavaScript");
        model.addAttribute("names", names);
        return "hello-list";

    }

}
