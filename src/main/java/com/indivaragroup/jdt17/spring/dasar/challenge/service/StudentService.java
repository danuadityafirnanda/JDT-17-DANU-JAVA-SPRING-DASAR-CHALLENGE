package com.indivaragroup.jdt17.spring.dasar.challenge.service;

import com.indivaragroup.jdt17.spring.dasar.challenge.model.impl.Student;
import com.indivaragroup.jdt17.spring.dasar.challenge.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(int id, String name) {
        Student student = new Student(id, name);
        studentRepository.add(student);
        System.out.println("===== Added Student =====");
        student.print();
    }

    public void findStudentById(int id) {
        System.out.printf("===== Find Student by Id %d =====\n", id);
        if (studentRepository.findById(id).isPresent()) {
            studentRepository.findById(id).get().print();
        } else {
            System.out.println("Student not found");
        }
    }

    public void getAllStudents() {
        System.out.println("===== Students List =====");
        studentRepository.getStudentList()
                .forEach(Student::print);
    }
}
