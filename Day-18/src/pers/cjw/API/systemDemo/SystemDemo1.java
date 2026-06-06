package pers.cjw.API.systemDemo;

public class SystemDemo1 {
    public static void main(String[] args) {

        // 获取当前时间所对应的毫秒值，类型为long
        long millis = System.currentTimeMillis();
        //英文即current time millisecond：当前时间毫秒

        System.out.println("当前时间所对应的毫秒值为：" + millis);
    }
}
