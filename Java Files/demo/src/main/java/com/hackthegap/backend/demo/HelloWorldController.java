package com.hackthegap.backend.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    private static final String template = "Hello, %s %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/hello-world")
    @ResponseBody
    public Greeting sayHello(@RequestParam(name="queryname", required=false, defaultValue="Stranger") String otherName, @RequestParam(name="lastname", required=false, defaultValue="Stranger") String lastName) {
        return new Greeting(counter.incrementAndGet(), String.format(template, otherName, lastName), "Third argument");
    }

    @GetMapping("/hello-person")
    @ResponseBody
    public Person sayHello(@RequestParam(name="isStudent", required=false, defaultValue="true") Boolean isStudent) {
       if (isStudent) {
        Student student = new Student();
        student.setFirstName("Daniel");
        student.setLastName("Alemayehu");
        student.setId("1");
        return student;
       } else {
        Teacher teacher = new Teacher();
        teacher.setFirstName("Nick");
        teacher.setLastName("Weber");
        return teacher;
       }
       
    }
}
