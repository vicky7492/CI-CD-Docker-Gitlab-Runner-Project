package com.student.StudentService.repository;

import com.student.StudentService.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByRollno (long rollno);
    List<Student> findByName (String name);
    List<Student> findByRollnoAndName (long rollno, String name);
}
