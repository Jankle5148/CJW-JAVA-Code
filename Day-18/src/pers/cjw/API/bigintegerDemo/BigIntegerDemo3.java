package pers.cjw.API.bigintegerDemo;

import java.math.BigInteger;

public class BigIntegerDemo3 {
    public static void main(String[] args) {

        //超出long范围的数据，就用BigInteger存。
        //怎么存：
        //（1）符号存在成员变量int signum里。
        //（2）先得到该数的补码，然后每32位截取一个小补码，再将每个截取的小补码转换回符号整数，存储在数据成员变量int[] mag里

        //int数组中最多能存储元素个数：21亿多
        //数组中每一位能表示的数字：-21亿到+21亿，即42亿多
        //理论上，BigInteger能表示的最大数字为：42亿的21亿次方。
        //但是还没到这个数字，电脑的内存就会撑爆，所以一般认为BigInteger是无限的。

        BigInteger bd = new BigInteger("-27670116110564327424");
        System.out.println(bd);

        //学会断点调试：点击代码前面成红点，右键不点运行，点调试，然后程序会运行到该代码的前一行。
        //按f7或者调试台的“步入”箭头，一个一步一步执行代码，检查是否有问题。

    }
}
