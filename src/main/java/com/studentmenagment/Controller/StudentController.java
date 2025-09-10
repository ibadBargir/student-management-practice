package com.studentmenagment.Controller;

import com.studentmenagment.Model.Student;
import com.studentmenagment.Services.StudentService;
import com.studentmenagment.Services.StudentServiceArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentServiceArrayList studentServiceArrayList;

    @RequestMapping("/students")
    public Map<Long, Student> getStudentsList(){

       return this.studentService.getAllStudents();
    }

    @PutMapping("/student/{id}")
    public void update(@PathVariable Long  id, @RequestBody Student student){
        this.studentService.updateStudentById(id, student);
    }


    @GetMapping("/student/{id}")
    public Student getstudentBYId(@PathVariable Long id){

        return this.studentService.getStudentById(id).orElse(null);

    }

    @PostMapping("/student")
    public void addstudent( @RequestBody Student newstudent){
        this.studentService.addStudent( newstudent);
    }


    @DeleteMapping("/student/{id}")
    public void DeleteStudentById(@PathVariable Long id){
        this.studentService.deleteStudentById(id);
    }



    //Yaha se jo methods calling hai wo Studentservices List wali ka hai


    @GetMapping("/studentsList")
    public List<Student> getStudents(){
     return studentServiceArrayList.getAllStudentsList();
    }

    @GetMapping("/Studentlist/{id}")
    public Student getStudentById(@PathVariable Long id){

        return studentServiceArrayList.getStudentById(id).orElse(null);
    }

    @PostMapping("/studentlist")
    public void addstudents(@RequestBody Student student){

        studentServiceArrayList.addStudent(student);

    }

    @PutMapping("/studentslist/{id}")
    public void updateStudent(@PathVariable Long id , @RequestBody Student newStudent){

        studentServiceArrayList.updateStudent(id, newStudent);


    }

    @DeleteMapping("/dleteStudentlist/{id}")
    public void DeleteStudnet(@PathVariable Long id){
        studentServiceArrayList.deleteStudent(id);
    }







}
