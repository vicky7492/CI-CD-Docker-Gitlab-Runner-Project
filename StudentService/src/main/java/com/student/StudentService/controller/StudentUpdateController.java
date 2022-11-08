package com.student.StudentService.controller;

import com.student.StudentService.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student Update")
public class StudentUpdateController extends StudentController{

    @PostMapping("/add student")
    public Student addStudent(@RequestBody Student student){
        return service.addStudent(student);
    }

    @PutMapping("/update student/{seqno}")
    public Student updateStudent(@PathVariable("seqno") long seqno, @RequestBody Student student){
        return service.updateStudent(seqno, student);
    }

    @DeleteMapping("/delete student/{seqno}")
    public void deleteStudent(@PathVariable("seqno") long seqno){
        service.deleteStudent(seqno);
    }
}
