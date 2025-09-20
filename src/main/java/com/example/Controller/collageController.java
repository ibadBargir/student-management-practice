package com.example.Controller;

import com.example.Model.Student;
import com.example.Model.collages;
import com.example.Services.CollagesSERVICES;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class collageController {

    @Autowired
    private CollagesSERVICES collagesSERVICES;


    @GetMapping("/collage")
    public List<collages> getALl(){
        return collagesSERVICES.getALL();
    }


    @PostMapping("/collages")
    public collages addCollage(@RequestBody collages coll ){
        return collagesSERVICES.addCollages(coll);
    }

    @GetMapping("/collages/{id}")
    public collages getCollageById(@PathVariable int id){
       return collagesSERVICES.getCollageById(id);
    }

    @PutMapping("/collage")
    public void updateCollage( @PathVariable int id , @RequestBody collages collages){
        collages.setId(id);
        collagesSERVICES.updateCollage(collages);
    }

    @DeleteMapping("/collage/{id}")
    public void deleteCollage(@PathVariable int id){
        collagesSERVICES.deleteCollage(id);
    }
}
