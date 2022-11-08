package com.teacher.controller;

import com.teacher.model.Teacher;
import com.teacher.service.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Teacher")
public class TeacherController {

    @Autowired
    private TeacherServiceImpl services;

    @PostMapping("/add")
    public Teacher addTeacher(@RequestBody Teacher teacher){
        return services.addTeacher(teacher);
    }

    @GetMapping("/view")
    public List<Teacher> viewTeacher(){
        return services.viewTeacher();
    }

    @PutMapping("/update Teacher/{teacherid}")
    public Teacher updateTeacher(@PathVariable("teacherid") long teacherid, @RequestBody Teacher teacher){
        return services.updateTeacher(teacherid, teacher);
    }

    @DeleteMapping("/delete Teacher/{teacherid}")
    public void deleteTeacher(@PathVariable("teacherid") long teacherid){
        services.deleteTeacher(teacherid);
    }
}
