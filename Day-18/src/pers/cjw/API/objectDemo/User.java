package pers.cjw.API.objectDemo;

import java.util.StringJoiner;

//一个类想要实现克隆，就要实现Cloneable接口
public class User implements Cloneable {

    private int id;
    private String username;
    private String password;
    private String path;
    private int[] data;

    public User() {
    }

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }


    public String toString() {
        return "角色编号为：" + id +
                "，用户名为：" + username +
                ", 密码为：" + password +
                ", 游戏图片为:" + path +
                ", 进度:" + arrToString();
    }


    //数组拼接成字符串
    public String arrToString() {

        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i] + "");
        }
        return sj.toString();
    }


    //重写Object的clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {

        //Object类的clone方法：默认 “浅克隆”
        //也就是基本数据直接复制过来，引用数据复制地址过来。
        //内容上看二者均相同，表面看是克隆了。
        //如果修改对象1的基本数据，不会影响对象2的基本数据。
        //但是因为对象1和克隆对象2共享 引用数据 的地址值，所以修改对象1的引用数据，会影响对象2。
        //为了方便，我们不需要全部改成深克隆，只需要将引用数据的部分重写为深克隆即可。

        //本类user类中，只有数组data引用数据，需要进行深克隆。
        //1.先把被克隆对象中的要克隆的data数据获取出来
        int[] data = this.data;

        //2.在内存中创建新的数组newData，地址和data数组不同，是全新的数组
        int[] newData = new int[data.length];

        //3.拷贝data数组中的数据
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        //新的数组已经准备好，接下来开始创建克隆对象。

        //4.调用父类中的方法克隆对象，即调用super的clone方法。
        //相当于让Object帮我们克隆一个对象，并把克隆之后的对象返回。
        //但是克隆出来的是object对象，没有成员变量，我们要将其墙砖成user类对象
        User u = (User) super.clone();

        //转换后，u为user对象，并有data属性，于是把新的数组newData拷贝到data。
        //实际上是拷贝newData的地址值，给u的data。
        //但因为此时已经是深克隆，u2的data和u1的data虽然内容完全相同，但是在内存中地址完全不同
        //所以修改u1的data不会影响u2的data，反之也不影响。达到我们的目的。
        u.data = newData;

        return u;
        //将这个克隆对象返回，虽然方法的返回值类型是object，但是由于多态，所以object的子类也能返回
    }
}
