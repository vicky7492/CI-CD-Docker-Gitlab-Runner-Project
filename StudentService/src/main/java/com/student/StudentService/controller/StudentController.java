package com.student.StudentService.controller;

import com.student.StudentService.model.Student;
import com.student.StudentService.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    public StudentServiceImpl service;

    @GetMapping("/view student")
    public List<Student> viewStudent(){
        return service.viewStudent();
    }

    @GetMapping("/student by name/{name}")
    public List<Student> viewStudentByName(@PathVariable("name") String name){
        return service.viewStudentByName(name);
    }

    @GetMapping("/student by rollno/{rollno}")
    public List<Student> viewStudentByRollNo(@PathVariable("rollno") long rollno){
        return service.viewStudentByRollno(rollno);
    }

    @GetMapping("/student by name and rollno/{name}/{rollno}")
    public List<Student> viewStudentByNameRollno(@PathVariable("name") String name, @PathVariable("rollno") long rollno){
        return service.viewStudentByNameAndRollno(rollno, name);
    }

//    @PostMapping("/add student")
//    public Student addStudent(@RequestBody Student student){
//        return service.addStudent(student);
//    }
//
//    @PutMapping("/update student/{seqno}")
//    public Student updateStudent(@PathVariable("seqno") long seqno, @RequestBody Student student){
//        return service.updateStudent(seqno, student);
//    }
}
