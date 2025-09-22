package com.example.Services;

import com.example.Model.School;
import com.example.Repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolServices {

    @Autowired
    private SchoolRepository schoolRepository;


    public List<School> getALL(){
        return schoolRepository.findAll();
    }

    public Optional<School> getById(int id){
        return schoolRepository.findById(id);
    }

    public void addSchool(School school){
        schoolRepository.save(school);
    }

    public void updateSchool(int id, School school){
        school.setId(id);
        schoolRepository.save(school);
    }

    public void DeleteSchool(int id){
        schoolRepository.deleteById(id);
    }
}
