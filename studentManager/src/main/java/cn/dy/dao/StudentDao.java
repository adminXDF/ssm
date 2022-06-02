package cn.dy.dao;

import cn.dy.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    List<Student> getAllStudent();

    int addStudent(Student student);

    void deleteStudent(@Param("id") int i);

    Student findStudentById(@Param("id")int i);

    void updateStudent(Student student);
}
