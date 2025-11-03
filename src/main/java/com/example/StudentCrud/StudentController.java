package com.example.StudentCrud;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public List<Student> show(){
        return studentService.show();
    }

    @PostMapping("/add")
    public String add(@RequestParam int id, @RequestParam String name){
        Student st = new Student(id,name);
        studentService.addStudent(st);
        return "added Successful";
    }

}
