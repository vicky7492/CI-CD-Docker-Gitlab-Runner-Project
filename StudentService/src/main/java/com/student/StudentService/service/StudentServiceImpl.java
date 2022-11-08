package com.student.StudentService.service;

import com.student.StudentService.model.Student;
import com.student.StudentService.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService{

    @Autowired
    public StudentRepository repo;

    @Override
    public List<Student> viewStudent(){
        return repo.findAll();
    }

    @Override
    public List<Student> viewStudentByRollno(long rollno){
        return repo.findByRollno(rollno);
    }

    @Override
    public List<Student> viewStudentByName(String name){
        return repo.findByName(name);
    }

    @Override
    public List<Student> viewStudentByNameAndRollno(long rollno, String name){
        return repo.findByRollnoAndName(rollno, name);
    }

    @Override
    public Student addStudent(Student student) {
        return repo.save(student);
    }

    @Override
    public Student updateStudent(long seqno, Student student) {
        return repo.save(student);
    }

    @Override
    public void deleteStudent(long seqno){
        repo.deleteById(seqno);
    }
}
