package pers.cjw.API;

public class StringPractice4 {
    public static void main(String[] args) {
        //两个字符串形式的整数，求他们的乘积，结果也是字符串
        //首先将字符串转化为整数，计算整数乘积，再转换成字符串

        //将字符串形式的整数变回整数的傻办法：变成字符数组，然后一位一位的乘10再加
        //两个好用的方法：
        //Integer.parseInt(string)：将字符串转换成int，前提是字符串形式的整数，不然报错
        //String.valueOf(int)：将int转换成字符串

        String str1 = "100";
        String str2 = "200";
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        String str3 = String.valueOf(num1 * num2);
        System.out.println(str3);
        System.out.println(str3.getClass());//string类型
    }
}
