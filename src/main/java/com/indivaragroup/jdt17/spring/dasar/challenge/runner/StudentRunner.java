package com.indivaragroup.jdt17.spring.dasar.challenge.runner;

import com.indivaragroup.jdt17.spring.dasar.challenge.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StudentRunner implements ApplicationRunner {
    private final StudentService studentService;

    public void run(ApplicationArguments args) throws Exception {
        // add students
        studentService.addStudent(1, "Budi");
        studentService.addStudent(2, "Andi");
        studentService.addStudent(3, "Siti");

        // find by id
        studentService.findStudentById(2);
        studentService.findStudentById(4);

        // get all students
        studentService.getAllStudents();
    }
}
