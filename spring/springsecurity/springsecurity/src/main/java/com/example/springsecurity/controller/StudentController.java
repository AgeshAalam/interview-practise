package com.example.springsecurity.controller;

import com.example.springsecurity.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
//e4ca12ae
@RestController

public class StudentController {
 List<Student> studentList= Arrays.asList(
        new Student(1,"agesh"),
        new Student(2,"bharath"),
         new Student(3,"bharath")
         );

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents(){
        return studentList.stream().toList();
    }
    @GetMapping(path = "{studentId}")
    public Student getStudentById(@PathVariable Integer studentId){
        return studentList.stream()
                .filter(student -> studentId.equals(student.getStudent_id()))
                //.map(Student::getStudent_name)
                .findAny().orElseThrow(()->new IllegalArgumentException("Student Id "+ studentId +" not found"));
    }
    @GetMapping( "/byname")
    public List<Student> getStudentList(@RequestParam String std_name){
        return studentList.stream().filter(s->std_name.equals(s.getStudent_name())).toList();
    }
    @GetMapping( path = "/byname/{std_name}")
    public List<Student> getStudentLists(@PathVariable String std_name){
        return studentList.stream().filter(s->std_name.equals(s.getStudent_name())).toList();
    }
}
