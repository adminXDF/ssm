package cn.dy.test;

import java.io.File;
import java.util.Scanner;

/**
 * @author xdf
 * 明天的你的会感谢今天努力的自己！
 * 2022-05-13 11:23
 */
public class TestPackage {
    private  static  String[] paths={
       "/src/main/java/cn/dy/dao",
       "/src/main/java/cn/dy/service",
       "/src/main/java/cn/dy/util",
       "/src/main/java/cn/dy/pojo",
       "/src/main/java/cn/dy/web",
       "/src/main/java/cn/dy/test",
    };

    public static void main(String[] args) {
        //获取当前项目的路径  所有人都一样
        createPackage();
    }

    public  static  void  createPackage(){
        System.out.println("请输入您目前的项目名称：不区分大小写");
        String path=new Scanner(System.in).next();
        String resultPath=System.getProperty("user.dir")+"/"+path;
        File file;
        for (String s:paths){
            file= new File(resultPath+s);
            file.mkdirs();
        }
    }
}
