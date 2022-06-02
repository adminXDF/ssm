package cn.dy.service;

import cn.dy.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();

    boolean addStudent(Student student);

    void deleteStudent(String id);

    Student findStudentById(String id);

    void updateStudent(Student student);
}
