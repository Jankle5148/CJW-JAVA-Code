package pers.cjw.API.runtimeDemo;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {

        //Runtime API：查看当前的jvm环境

        //public static Runtime getRuntime () ：获取当前系统的“运行环境”对象
        //public void exit (int status)：停止虚拟机，和 system 中的exit方法一样
        //public int availableProcessors () ：获得 CPU 的可用线程数
        //public long maxMemory () ：JVM 能 从系统中获取最大总内存大小(单位byte)
        //public long totalMemory () ：JVM 已经 从系统中获取总内存大小(单位byte)
        //public long freeMemory () ：当前 JVM 剩余的内存大小(单位byte)
        //public Process exec (string command)：运行 cmd 命令

        //--------------------------------------------------------------------------------------------------------------

        //1.获取Runtime的对象，不能直接new，而是使用getRuntime
        Runtime r1 = Runtime.getRuntime();
        //不能直接new，因为构造方法是私有，外部无法调用。
        //Runtime类一旦加载，类内部就会创建一个Runtime类的单例currentRuntime，是调用自己内部的私有构造创建的Runtime对象。
        //并且这个对象为final。是因为一个jvm只需要一个jvm运行环境，所以将Runtime设置为final没问题。
        //同时Runtime类对外开放一个公有方法getRuntime，能将这个Runtime类的实例currentRuntime返回，供外部使用。

        //实际上Runtime没必要创建对象r1还是r2还是多少。
        //因为Runtime加载就有一个线程的currentRuntime，直接Runtime.getRuntime()就可以得到一个Runtime对象。

        //--------------------------------------------------------------------------------------------------------------

        //2.exit 停止虚拟机
        //Runtime.getRuntime().exit(0);
        //System.exit(0)实际上是调用的这个方法。

        //--------------------------------------------------------------------------------------------------------------

        //3.获得电脑CPU的线程数：本电脑4核8线程
        System.out.println(Runtime.getRuntime().availableProcessors());//8

        //--------------------------------------------------------------------------------------------------------------

        //4.总内存大小,单位Byte字节，换算成KB,MB,GB除1024即可
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024 + "MB");//4068MB
        //5.已经获取的总内存大小,单位byte字节，换算成KB,MB,GB除1024即可
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024 + "MB");//256MB
        //6.jvm剩余内存大小，换算成KB,MB,GB除1024即可
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024 + "MB");//253MB

        //--------------------------------------------------------------------------------------------------------------

        //7.运行cmd命令，命令以字符串形式进行传参
        //shutdown :关机
        //加上参数才能执行
        //-s :默认在1分钟之后关机
        //-s -t 指定时间 : 指定关机时间
        //-a :取消关机操作
        //-r: 关机并重启

        //比如用cmd打开记事本。
        //但是exec会报错，我们要在main方法声明时抛出异常
        Runtime.getRuntime().exec("notepad");


    }
}
