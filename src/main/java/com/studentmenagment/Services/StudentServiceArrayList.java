package com.studentmenagment.Services;

import com.studentmenagment.Model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * StudentServiceArrayList
 *
 * 👉 Is service class me maine List (ArrayList) ka use kiya hai students ko store karne ke liye.
 *    - Students ek ArrayList me save hote hain
 *    - CRUD operations (Create, Read, Update, Delete) ArrayList ke methods aur stream() use karke implement kiye gaye hain.
 */

@Service
public class StudentServiceArrayList {

    List<Student> students = new ArrayList<>();

    public StudentServiceArrayList(){
        students.add(new Student(1L, 1, "Ibad", "ibad@gmail.com", 20));
        students.add(new Student(2L, 18, "Jhon", "jhon@gmail.com", 12));
        students.add(new Student(3L, 7, "Mike", "mikE@gmaile.com", 17));
        students.add(new Student(4L, 6, "Clarck kent", "calckkent@gmail.com", 18));
        students.add(new Student(5L, 11, "Peter Parker", "peterparkar@gmail.com", 18));
    }

    public List<Student> getAllStudentsList(){
        return students;
    }

    public Optional<Student> getStudentById(Long id){
        return students.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void deleteStudent(Long id){
        students.removeIf(student -> student.getId().equals(id));
    }

    public void updateStudent(Long id,  Student newstudent){
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                students.set(i, newstudent);
                break;
            }
        }
    }
}
