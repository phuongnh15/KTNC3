package com.example.luyenthi_bai1.service;

import com.example.luyenthi_bai1.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student){
        if(student==null){
            throw new IllegalArgumentException("Student khong duoc trong");
        }
        studentList.add(student);
    }

    public Student getOneStudent(long id){
        return studentList.stream()
                .filter(student -> student.getId()==id)
                .findFirst().orElse(null);
    }

    public boolean deleteStudent(long id){
        if(String.valueOf(id).trim().isEmpty()){
            throw new IllegalArgumentException("Chua chon id");
        }
        for (int i = 0;i<studentList.size();i++){
            if(studentList.get(i).getId()==id){
                studentList.remove(i);
                return true;
            }
        }
        return false;
    }

    public void updateStudent(Student student){
        for (int i = 0;i<studentList.size();i++){
            if(studentList.get(i).getId()==i){
                studentList.set(i,student);
            }else {
                throw new IllegalArgumentException("Khong update duoc");
            }
        }
    }

    public List<Student> getAll(){return new ArrayList<>(studentList);}
}
