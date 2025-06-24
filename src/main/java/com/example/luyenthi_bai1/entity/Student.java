package com.example.luyenthi_bai1.entity;

public class Student {
    private long id;
    private String name;
    private int age;
    private float mark;

    public Student() {
    }

    public Student(long id, String name, int age, float mark) {
        this.id = id;
        setName(name);
        setAge(age);
        setMark(mark);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Khong de trong name");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<18){
            throw new IllegalArgumentException("Tuoi phai >= 18");
        }
        this.age = age;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        if(mark<0 || mark>10){
            throw new IllegalArgumentException("0<=mark<=10");
        }
        this.mark = mark;
    }
}
