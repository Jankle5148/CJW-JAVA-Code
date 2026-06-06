package pers.cjw.API.systemDemo;

public class SystemDemo3 {
    public static void main(String[] args) {

        System.out.println("程序开始执行了.....");

        //exit:终止当前jvm
        System.exit(0);

        //因为虚拟机已经终止，所以这句话打印不出来
        System.out.println("程序终止了.....");
    }
}
