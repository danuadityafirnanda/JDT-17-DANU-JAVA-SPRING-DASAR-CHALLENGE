package com.indivaragroup.jdt17.spring.dasar.challenge.repository;

import com.indivaragroup.jdt17.spring.dasar.challenge.model.impl.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class StudentRepository {
    List<Student> studentList = new ArrayList<>();

    public void add(Student student) {
        studentList.add(student);
    }

    public Optional<Student> findById(int id) {
        return studentList.stream()
                .filter(student -> student.getId() == id)
                .findFirst();
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
