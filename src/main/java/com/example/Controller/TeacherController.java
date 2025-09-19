package com.example.Controller;


import com.example.Model.Teacher;
import com.example.Services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/teachers")
    public List<Teacher> getAllteachers(){
        return teacherService.getAllTeacher();
    }

    @PostMapping("/teachers")
    public Teacher addTeacher(@RequestBody Teacher teacher){
       return  teacherService.addTeacher(teacher);
    }

    @PutMapping("/teachers")
    public void updateTeacher(@PathVariable int id,@RequestBody Teacher teacher){
        teacher.setId(id);
        teacherService.updateTeacher(teacher);
    }

    @DeleteMapping("/teachers/{id}")
    public void DelteTeacher(@PathVariable int id){
        teacherService.deleteTeacher(id);
    }
}
