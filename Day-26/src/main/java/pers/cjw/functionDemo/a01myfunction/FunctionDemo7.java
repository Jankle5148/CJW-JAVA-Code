package pers.cjw.functionDemo.a01myfunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FunctionDemo7 {
    public static void main(String[] args) {

        //需求：将集合中存储一些字符串的数据，比如：张三,23，收集到Student类型的数组当中。

        //1.创建集合并添加元素
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌,15", "周芷若,14", "赵敏,13", "张强,20", "张三丰,100", "张翠山,40", "张良,35", "王二麻子,37", "谢广坤,41");

        //2.先把字符串变成Student对象，然后再把Student对象收集到起来
        Student[] arr = list.stream().map(Student::new).toArray(Student[]::new);
        //（1）stream()先获取流
        //（2）map(Student::new)将其变成student对象
        //（3）toArray(Student[]::new)添加进Student类型的数组，用一个数组arr接收。

        //3.打印数组arr
        System.out.println(Arrays.toString(arr));


    }
}
