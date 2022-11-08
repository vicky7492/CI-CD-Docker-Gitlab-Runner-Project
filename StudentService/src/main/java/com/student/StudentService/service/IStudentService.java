package com.student.StudentService.service;


import com.student.StudentService.model.Student;

import java.util.List;

public interface IStudentService {
    public List<Student> viewStudent();
    public List<Student> viewStudentByRollno(long rollno);
    public List<Student> viewStudentByName(String name);
    public List<Student> viewStudentByNameAndRollno(long rollno, String name);
    public Student addStudent(Student student);
    public Student updateStudent(long seqno, Student student);
    public void deleteStudent(long seqno);
}
