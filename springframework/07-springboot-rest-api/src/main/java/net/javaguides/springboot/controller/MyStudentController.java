package net.javaguides.springboot.controller;


import net.javaguides.springboot.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class MyStudentController
{
    List<Student> students=new ArrayList<>(List.of(new Student(1,"jaga","pepa"),new Student(2,"chandra","pepa")));
    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudents()
    {

        List<Student> mylist=students.stream().filter(e->e!=null).collect(Collectors.toList());
//        return new ResponseEntity<>(mylist, HttpStatus.OK);
        return ResponseEntity.ok().header("hi","hello").body(mylist);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable int id)
    {

        List<Student> mylist=students.stream().filter(e->e.getId()==id).collect(Collectors.toList());
        Student student=mylist.get(0);
//      return new ResponseEntity<>(mylist, HttpStatus.OK);
        return ResponseEntity.ok().header("hi","hello").body(student);
    }

    @GetMapping("/query")
    public ResponseEntity<Student> studentByRequestParam(@RequestParam int id,@RequestParam String firstName,@RequestParam String lastName)
    {
        System.out.println(id);
        System.out.println(firstName);
        System.out.println(lastName);
        Student student=new Student(id,firstName,lastName);
        return ResponseEntity.ok().header("hi","hello").body(student);

    }

    @PostMapping("/students")
    public ResponseEntity<Student> createStudent(@RequestBody Student student)
    {
        this.students.add(student);
        return new ResponseEntity<>(student,HttpStatus.CREATED);
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable int id)
    {

        Student student=this.students.stream().filter(e->e.getId()==id).collect(Collectors.toList()).get(0);
        this.students.remove(student);
        return new ResponseEntity<>(student,HttpStatus.OK);
    }

    @PutMapping("/students/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable int id,@RequestBody Student student)
    {




    }

}



