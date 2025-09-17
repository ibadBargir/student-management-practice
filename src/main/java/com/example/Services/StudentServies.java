package com.example.Services;

import com.example.Model.Student;
import com.example.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServies {

    @Autowired
    private StudentRepository studentRepository;

    public StudentServies(){

    }

    public List<Student> getallStudent(){
        return  studentRepository.findAll();
    }

    public Student getStudentByID(int id){
        return this.studentRepository.findById(id).orElse(new Student());
    }

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }

    public void updateStudent(Student student ){
         studentRepository.save(student);
    }

    public void DeleteStudent(int stuid){
        studentRepository.deleteById(stuid);
    }
}
