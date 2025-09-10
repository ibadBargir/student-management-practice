package com.studentmenagment.Services;

import com.studentmenagment.Model.Student;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * StudentServiceMap
 *
 * 👉 Is service class me maine Map (HashMap) ka use kiya hai students ko store karne ke liye.
 *    - Students ek HashMap me save hote hain jisme key = studentId, value = Student object hota hai
 *    - CRUD operations direct Map ke put(), get(), remove() methods se implement kiye gaye hain.
 */

@Service
public class StudentService {



    Map<Long ,Student> students = new HashMap();
   public StudentService(){

       students.put(1L, new Student(1L, 001, "Ibad","ibad@example.com",26));
       students.put(2L, new Student(2L, 002, "Jhon","jhon@example.com",36));
       students.put(3L, new Student(3L, 003, "Mike","mike@example.com",16));
       students.put(4L, new Student(4L, 004, "Stev","stev@example.com",19));
       students.put(5L, new Student(5L, 005, "Smoodh","smoodh@example.com",22));

       /*students.add (new Student(1, 001, "Shaam", "shaam@gmail.com", 16));
       students.add(new Student());
       students.add(new Student(2, 002,"Jhon", "jhon@gamil.com",18 ));
       students.add(new Student(3, 003, "Mike", "mike@gmail.com",15));
       students.add(new Student(4, 005, "Azelnidipine", "azelidipine@game.com",13));*/
   }

   //if we use List
    /*public List<Student> getAllStudent(){
        return students;
    }

    public Optional<Student> getStudentById(Long id){
        return students.stream()
                .filter(s->s.getId()==id)
                .findFirst();
    }*/

    //get all
   public Map<Long,Student> getAllStudents(){
        return students;
   }

   //get singel student by Id
    public Optional<Student> getStudentById(Long id) {
        return Optional.ofNullable(students.get(id));
    }

    //add new
    public void addStudent(Student student){
       students.put(student.getId(), student);

    }

    //Update
    public void updateStudentById(Long id, Student newStudent){
       students.put(id, newStudent);
    }

    //delete
    public void deleteStudentById(Long id){
       students.remove(id);
    }
}
