package com.example.luyenthi_bai1.service;

import com.example.luyenthi_bai1.entity.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    private StudentService studentService;

    @BeforeEach
    void setUp(){
        studentService = new StudentService();
    }
    @Test
    void addStudentWithHopLe() {
        Student student = new Student(1,"Long",24,9.0f);
        studentService.addStudent(student);

        Assertions.assertEquals("Long",studentService.getOneStudent(1).getName());
    }

    @Test
    void addStudentWithStudentNull() {
        Assertions.assertThrows(IllegalArgumentException.class,()->studentService.addStudent(null));
    }

    @Test
    void addStudentWithNameNull() {
        Exception exception = assertThrows(IllegalArgumentException.class,()->studentService.addStudent(new Student(1,"",35,8.9f)));
        assertEquals("Khong de trong name",exception.getMessage());
    }

    @Test
    void addStudentWithAgeKhongHL() {
        Assertions.assertThrows(IllegalArgumentException.class,()->studentService.addStudent(new Student(1,"Cong",15,8.9f)));
    }

    @Test
    void addStudentWithMarkKhongHL() {
        Assertions.assertThrows(IllegalArgumentException.class,()->studentService.addStudent(new Student(1,"Cong",25,11)));
    }

    @Test
    void getOneStudent() {
    }

    @Test
    void deleteStudent() {
    }

    @Test
    void updateStudent() {
    }

    @Test
    void getAll() {
    }
}