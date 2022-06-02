package cn.dy.pojo;

import java.io.Serializable;

/**
 * @author xdf
 * 明天的你的会感谢今天努力的自己！
 * 2022-05-13 10:07
 */
public class Admin  implements Serializable {

    private  int id;
    private  String username;
    private  String password;
    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Admin() {

    }

    public Admin(int id, String username, String password) {

        this.id = id;
        this.username = username;
        this.password = password;
    }



}
