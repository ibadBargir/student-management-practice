package com.example.Services;


import com.example.Model.Teacher;
import com.example.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {


    @Autowired
    private TeacherRepository teacherRepository;


    public List<Teacher> getAllTeacher(){
        return teacherRepository.findAll();
    }

    public Teacher addTeacher(Teacher teacher){
       return teacherRepository.save(teacher);
    }

    public Optional<Teacher> getTeacherById(int id){
      return   teacherRepository.findById(id);
    }

    public void updateTeacher(Teacher teacher){
        teacherRepository.save(teacher);
    }

    public void deleteTeacher(int id){
        teacherRepository.deleteById(id);
    }
}
