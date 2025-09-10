package com.studentmenagment.Model;

public class Student {

    private Long id;
    private int rollno;
    private String name;
    private String email;
    private int age;

    public Student(){
        System.out.println("The default data");
    }

    public Student(Long id, int rollno, String name, String email, int age){
        this.id = id;
        this.rollno = rollno;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    // ✅ Correct getter
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
