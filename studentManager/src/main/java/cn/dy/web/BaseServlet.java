package cn.dy.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import sun.security.util.AuthResources_it;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BaseServlet extends HttpServlet {
    /**
     * HttpServletRequest:用户的请求
     * HttpServletResponse：给用户的响应
     * service 会根据请求访问不同的方法
     * URI:====>/travel/user/method
     * URI:====>/travel/user/login
     * URI:====>/travel/user/register
     * 我们获取最后/ 之后的内容 就是需要执行的方法名
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取用户访问的路径
        String uri = req.getRequestURI();
        int index=uri.lastIndexOf("/");
        String methodName=uri.substring(index+1,uri.length());
        try {
            //利用反射机制执行获取的方法
            Method method= this.getClass().getMethod(methodName,HttpServletRequest.class,HttpServletResponse.class);
            method.invoke(this,req,resp);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    protected void getJson(HttpServletResponse response,Object obj)throws  Exception{
        ObjectMapper mapper=new ObjectMapper();
        String json = mapper.writeValueAsString(obj);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json);
    }

}
