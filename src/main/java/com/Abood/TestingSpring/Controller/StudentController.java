package com.Abood.TestingSpring.Controller;

import com.Abood.TestingSpring.request.NewStudentRequest;
import com.Abood.TestingSpring.service.StudentService;
import com.Abood.TestingSpring.user.Student;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;


import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService=studentService;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping
    public Student addNewStudent(@RequestBody NewStudentRequest newStudentRequest) {
        return studentService.addNewStudent(newStudentRequest);
    }
    @DeleteMapping
    public void deleteStudent(@RequestBody NewStudentRequest newStudentRequest) {
        studentService.deleteStudent(newStudentRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable("id") Integer id) {
        studentService.deleteByiD(id);
    }

}
