package cn.dy.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author xdf
 * 明天的你的会感谢今天努力的自己！
 * 2022-05-10 10:23
 */
public class DaoMapperFactory {
    private  static  SqlSession session;
    static {
        InputStream is;
        try {
            //01、创建核心配置文件
            is=Resources.getResourceAsStream("SqlMapConfig.xml");
            //02、创建SqlSessionFactory工厂
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(is);
            //03、创建SqlSession对象
            session = factory.openSession(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  static Object getDao(Class<?> cls){
        return  session.getMapper(cls);
    }
}
