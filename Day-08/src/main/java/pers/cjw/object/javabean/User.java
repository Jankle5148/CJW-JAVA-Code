package pers.cjw.object.javabean;

public class User {
    //描述一个物的类，不是测试类。就叫javabean类
    //标准javabean类至少要：
    //（1）见名知意
    //（2）成员变量全private
    //（3）至少两个构造方法：无参构造、全部参数有参构造
    //（4）每个private变量有一个set方法、一个get方法
    //（5）还有其他行为，也写上

    private String name;
    private String password;
    private String email;
    private String gender;
    private int age;

    //快捷键alt+insert或者空白处鼠标右键“生成”“generate”
    //构造函数，点击无选择，就是无参构造。全选择就是全部参数有参构造，也可以自己选择传入的参数多少
    //getter和setter：get和set方法

    //更快捷的方法：下载ptg插件，然后定义好private成员变量后，空白处右键“ptg to javabean”，直接全部生成

    public User() {
    }//无参构造

    public User(String name, String password, String email, String gender, int age) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }//全部参数有参构造

    //set、get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
