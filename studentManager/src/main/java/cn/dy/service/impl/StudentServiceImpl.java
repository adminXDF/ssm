package cn.dy.service.impl;

import cn.dy.dao.StudentDao;
import cn.dy.pojo.Student;
import cn.dy.service.StudentService;
import cn.dy.util.DaoMapperFactory;

import java.util.List;

/**
 * @author xdf
 * 明天的你的会感谢今天努力的自己！
 * 2022-05-13 14:05
 */
public class StudentServiceImpl implements StudentService {


    private StudentDao dao=(StudentDao)DaoMapperFactory.getDao(StudentDao.class);
    @Override
    public List<Student> getAllStudent() {
        return dao.getAllStudent();
    }


    @Override
    public boolean addStudent(Student student) {
        int flag=dao.addStudent(student);
        if (flag==0){
            return false;
        }else {
            return  true;
        }
    }

    @Override
    public void deleteStudent(String id) {
        dao.deleteStudent(Integer.parseInt(id));
    }

    @Override
    public Student findStudentById(String id) {
        return dao.findStudentById(Integer.parseInt(id));
    }

    @Override
    public void updateStudent(Student student) {
          dao.updateStudent(student);
    }
}
