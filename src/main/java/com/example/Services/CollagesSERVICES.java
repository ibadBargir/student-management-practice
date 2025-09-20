package com.example.Services;


import com.example.Model.Student;
import com.example.Model.collages;
import com.example.Repository.CollagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollagesSERVICES {

    @Autowired
    private CollagesRepository collagesRepository;


    public List<collages> getALL(){
        return collagesRepository.findAll();
    }

    public collages addCollages(collages col){
        return collagesRepository.save(col);
    }

    public collages updateCollage( collages collages){
        return collagesRepository.save(collages);
    }

    public boolean deleteCollage(int id){
        boolean bol = false;
         if (collagesRepository.existsById(id)){
             collagesRepository.deleteById(id);
             return true;
         } return
         false;
    }

    public collages getCollageById(int id){
       return collagesRepository.findById(id).orElse(new collages());
    }

    /*public Student getStudentByID(int id){
        return this.studentRepository.findById(id).orElse(new Student());
    }*/
}
