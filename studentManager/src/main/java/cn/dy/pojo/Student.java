package cn.dy.pojo;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author xdf
 * 明天的你的会感谢今天努力的自己！
 * 2022-05-13 14:02
 */
public class Student implements Serializable {
    private  int id;
    private  int age;
    private  String sname;
    private  String address;
    private  Date birthday;
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + sname + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String name) {
        this.sname = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }



    public Student(int id, int age, String name, String address, Date birthday) {
        this.id = id;
        this.age = age;
        this.sname = name;
        this.address = address;
        this.birthday = birthday;
    }

    public Student() {

    }





}
