package pers.cjw.practice;

import java.util.Random;

public class Practice3 {
    public static void main(String[] args) {
        //定义方法随机产生一个五位的验证码,前四位是大小写字母，最后一位是数字
        getCode();
    }
    //这种方法代码行没有那么多，但是事实上最好的思想是：
    // 将可能出现的字符全部存进一个数组里，然后从数组随机挑选形成验证码
    public static void getCode(){
        Random r = new Random();
        char[] code = new char[4];
        String codeResult = "";
        int num;
        for (int i = 0; i < 5; ++i) {
            num = 0;
            if (i < 4) {
                while (!((num >= 65 && num <= 90) || (num >= 97 && num <= 122))) {
                    num = 65 + r.nextInt(58);
                }
                code[i] = (char) num;
                codeResult = codeResult + code[i];
            } else {
                num = r.nextInt(10);
                codeResult = codeResult + num;
            }
        }
        System.out.println(codeResult);
    }
}
