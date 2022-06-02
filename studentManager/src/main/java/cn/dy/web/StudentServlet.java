package cn.dy.web;

import cn.dy.pojo.Admin;
import cn.dy.pojo.Student;
import cn.dy.service.StudentService;
import cn.dy.service.UserService;
import cn.dy.service.impl.StudentServiceImpl;
import cn.dy.service.impl.UserServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@WebServlet("/student/*")
public class StudentServlet extends BaseServlet {
    private  StudentService service=new StudentServiceImpl();

    /**
     * 查询所有学生信息
     */
    public  void  findAllStudent(HttpServletRequest request,HttpServletResponse response)throws  Exception{
        System.out.println("================进入了查询所有学生信息================");
        //调用service层代码
        List<Student> students= service.getAllStudent();
        getJson(response,students);
    }
    /**
     * 新增学生信息
     */
    public  void  addStudent(HttpServletRequest request,HttpServletResponse response)throws  Exception{
        System.out.println("================进入了新增学生信息================");
        Map<String, String[]> map = request.getParameterMap();
        Student student=new Student();
        BeanUtils.populate(student,map);
        //调用service层代码
        boolean flag= service.addStudent(student);
        getJson(response,flag);
    }

    /**
     * 删除学生信息
     */
    public  void  deleteStudent(HttpServletRequest request,HttpServletResponse response)throws  Exception{
        System.out.println("================进入了删除学生信息================");
        String id=request.getParameter("id");
        //调用service层代码
        service.deleteStudent(id);
        response.sendRedirect("/studentManager/studentList.html");
    }
    /**
     * 查询指定id的学生信息
     */
    public  void  findStudentById(HttpServletRequest request,HttpServletResponse response)throws  Exception{
        System.out.println("================进入了查询指定id的学生信息================");
        String id=request.getParameter("id");
        //调用service层代码
        Student student=service.findStudentById(id);
        getJson(response,student);
    }

    /**
     * 修改学生信息
     */
    public  void  updateStudent(HttpServletRequest request,HttpServletResponse response)throws  Exception{
        System.out.println("================进入了修改学生信息================");
        request.setCharacterEncoding("utf-8");
        Map<String, String[]> map = request.getParameterMap();
        Student student=new Student();
        BeanUtils.populate(student,map);
        System.out.println(student);
        //调用service层代码
        service.updateStudent(student);
    }

}
