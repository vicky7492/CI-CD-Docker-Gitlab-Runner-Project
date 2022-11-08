package com.teacher.service;

import com.teacher.model.Teacher;
import com.teacher.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl {

    @Autowired
    public TeacherRepository repo;

    public Teacher addTeacher(Teacher teacher){
        return repo.save(teacher);
    }

    public List<Teacher> viewTeacher(){
        return repo.findAll();
    }

    public Teacher updateTeacher(long teacherid, Teacher teacher){
        return repo.save(teacher);
    }

    public void deleteTeacher(long teacherid){
        repo.deleteById(teacherid);
    }
}
