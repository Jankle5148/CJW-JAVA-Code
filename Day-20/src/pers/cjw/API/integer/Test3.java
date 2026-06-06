package pers.cjw.API.integer;

public class Test3 {
    public static void main(String[] args) {

        String s = tobinarystring(127);
        System.out.println(s);

    }

    public static String tobinarystring(int number) {//6
        //核心逻辑:不断的去除以2，得到余数，一直到商为0就结束。
        //将得到的所有余数倒着拼接起来

        //1.定义一个StringBuilder用来存储余数
        StringBuilder sb = new StringBuilder();

        //2.利用循环不断的除以2获取余数，然后余数入sb
        while (true) {

            //如果数 = 0.退出循环
            if (number == 0) {
                break;
            }

            //如果数！=0，获取余数
            int remaindar = number % 2;

            //offset=0，说明插入方式为头插，将余数头插进sb
            sb.insert(0, remaindar);

            //将number/2
            number = (number - remaindar) / 2;
        }

        //因为是头插，所以sb中元素已经逆序，再将sb中元素拼接成字符串返回
        return sb.toString();
    }


}
