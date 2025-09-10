package com.studentmenagment.Services;

import com.studentmenagment.Model.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StuddentPrectice {

    List<Student> students = new ArrayList<>();

    public StuddentPrectice(){

        students.add(new Student(1L, 001, "Ibad","ibad@example.com",16));
        students.add(new Student(11L, 003, "Ibad","ibad@example.com",26));
        students.add(new Student());
        students.add(new Student(2L, 002,"Jhon", "jhon@gamil.com",18 ));
        students.add(new Student(3L, 003, "Mike", "mike@gmail.com",15));
        students.add(new Student(4L, 005, "Azelnidipine", "azelidipine@game.com",13));


    }

    public List<Student> getAllStudent(){
        return students;
    }

    public Optional<Student> getStudentById(Long id){
        return students.stream()
                .filter(s->s.getId()==id)
                .findFirst();
    }
}
