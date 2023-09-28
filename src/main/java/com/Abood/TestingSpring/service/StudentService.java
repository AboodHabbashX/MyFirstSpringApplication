package com.Abood.TestingSpring.service;


import com.Abood.TestingSpring.repository.StudentRepository;
import com.Abood.TestingSpring.request.NewStudentRequest;

import com.Abood.TestingSpring.user.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student addNewStudent(NewStudentRequest newStudentRequest) {
        return studentRepository.save(
                new Student(
                        newStudentRequest.id(),
                        newStudentRequest.firstName(),
                        newStudentRequest.lastName(),
                        newStudentRequest.email()
                )
        );
    }

    public void deleteStudent(NewStudentRequest newStudentRequest) {
        studentRepository.delete(
                new Student(
                        newStudentRequest.id(),
                        newStudentRequest.firstName(),
                        newStudentRequest.lastName(),
                        newStudentRequest.email()
                )
        );
    }

    public void deleteByiD(Integer id){
        studentRepository.deleteById(id);
    }


}
