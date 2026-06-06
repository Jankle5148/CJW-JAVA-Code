package pers.cjw.practice;

import java.util.Random;

public class Practice4 {
    public static void main(String[] args) {
        //定义方法随机产生一个五位的验证码,前四位是大小写字母，最后一位是数字
        getCode();
    }
    // 方便维护的思想是：
    // 将可能出现的字符全部存进一个数组里，然后从数组随机挑选形成验证码
    public static void getCode() {
        Random r = new Random();
        //大小写字母共52个
        char[] code = new char[52];
        for (int i = 0; i < code.length; ++i) {
            if (i < 26) {
                code[i] = (char) (65 + i);//大写字母
            } else {
                code[i] = (char) (97 + i - 26);//小写字母
            }
        }//得到验证码数组的过程，事实上也可以抽象出一个方法，但此处不必。
        String codeResult = "";
        for (int i = 0; i < 4; ++i) {
            codeResult = codeResult + code[r.nextInt(code.length)];
        }
        codeResult = codeResult + r.nextInt(10);
        System.out.println(codeResult);
    }

}
