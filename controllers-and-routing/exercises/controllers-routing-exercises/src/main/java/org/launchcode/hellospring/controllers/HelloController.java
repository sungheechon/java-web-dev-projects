package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

//    @RequestMapping(value="")
//    @ResponseBody
//    public String index(@RequestParam String name) {
//        if (name == null) {
//            name = "World";
//        }
//        return "Hello " + name;
//    }

    @RequestMapping(value="hello", method = RequestMethod.GET)
  
    public String helloForm()  {


        return "form";

        // For a bonus mission, the options of the select need to be pulled in from a model.
        // If a student has chosen to try this mission, they need to add a models package that contains a model for the different language options.
    }

    @RequestMapping(value="hello", method = RequestMethod.POST)
    @ResponseBody
    public String helloPost(@RequestParam String name, @RequestParam String language) {
        if (name == null) {
            name = "World";
        }

        return createMessage(name, language);

        // For a bonus mission, students can change this response text to look nicer.
        // This is subjective, but students should be modifying the HTML of the response string.
    }

    public static String createMessage(String n, String l) {
        String greeting = "";

        if (l.equals("english")) {
            greeting = "Hello";
        }
        else if (l.equals("french")) {
            greeting = "Bonjour";
        }
        else if (l.equals("italian")) {
            greeting = "Bonjourno";
        }
        else if (l.equals("spanish")) {
            greeting = "Hola";
        }
        else if (l.equals("german")) {
            greeting = "Hallo";
        }

        return greeting + " " + n;
    }

    @RequestMapping(value="hello/{name}")
    @ResponseBody
    public String helloUrlSegment(@PathVariable String name) {
        return "Hello " + name;
    }

    @RequestMapping(value="goodbye")
    @ResponseBody
    public String goodbye() {
        return "Goodbye!";
    }
}

