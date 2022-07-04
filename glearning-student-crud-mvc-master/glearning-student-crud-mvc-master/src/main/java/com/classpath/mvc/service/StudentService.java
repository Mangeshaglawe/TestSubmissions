package com.classpath.mvc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.classpath.mvc.dao.StudentDAO;
import com.classpath.mvc.model.Student;

 
@Service
@Transactional
public class StudentService{
 
    @Autowired
    private StudentDAO studentDAO;
 
    
    @Transactional
    public void addStudent(Student student) {
    	studentDAO.addStudent(student);
    }
 
    
    @Transactional
    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }
 
    @Transactional
    public void deleteStudent(Integer studentId) {
    	studentDAO.deleteStudent(studentId);
    }
 
    public Student getStudent(int studentid) {
        return studentDAO.getStudent(studentid);
    }
 
    public Student updateStudent(Student student) {
        return studentDAO.updateStudent(student);
    }
 
    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }
 
}
