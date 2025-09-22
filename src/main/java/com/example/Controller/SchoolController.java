package com.example.Controller;

import com.example.Model.School;
import com.example.Services.SchoolServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SchoolController {

    @Autowired
    private SchoolServices schoolServices;

    @GetMapping("/school")
    public List<School> getAll(){
        return schoolServices.getALL();
    }

    @GetMapping("/school/{id}")
    public Optional<School> getById(@PathVariable int id){
        return schoolServices.getById(id);
    }

    @PostMapping("/school")
    public void addSchool(@RequestBody School school){
        schoolServices.addSchool(school);
    }

    @PutMapping("/school/{id}")
    public void updateSchoole( @PathVariable int id,@RequestBody School school){
         schoolServices.updateSchool(id, school);
    }

    @DeleteMapping("/school/{id}")
    public void DeleteSchool(@PathVariable int id){
        schoolServices.DeleteSchool(id);
    }
}
