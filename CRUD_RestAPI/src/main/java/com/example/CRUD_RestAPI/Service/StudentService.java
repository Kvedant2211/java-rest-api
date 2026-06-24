package com.example.CRUD_RestAPI.Service;
import com.example.CRUD_RestAPI.Model.Student;
import com.example.CRUD_RestAPI.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {

    @Autowired
    StudentRepo repo;

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student getStudentbyId(int id) {
        return repo.findById(id).orElse(new Student());
    }

    public void createStudent(Student student) {
        repo.save(student);
    }

    public void updateStudentbyId(int id, Student updatedStudent) {
        repo.save(updatedStudent);
    }

}
