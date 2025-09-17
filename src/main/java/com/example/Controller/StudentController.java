package com.example.Controller;


import com.example.Model.Student;
import com.example.Services.StudentServies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnCheckpointRestore;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentServies studentServies;

    @GetMapping("/student")
    public List<Student> getAllStudent(){

        return studentServies.getallStudent();
    }

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){
        return studentServies.addStudent(student);
    }

    @GetMapping("/student/{stuid}")
    public Student getStudentById(@PathVariable int stuid){
     return   studentServies.getStudentByID(stuid);

    }

    @PutMapping("/student/{id}")
    public Student updateSTudent(@PathVariable int id ,@RequestBody Student student){

        student.setId(id);

        return  studentServies.addStudent(student);
    }


    @DeleteMapping("/student /{id}")
    public String deleteStudent(@PathVariable int id){
        studentServies.DeleteStudent(id);

        return "Student with ID"+ id + "Successfully";
    }

}
