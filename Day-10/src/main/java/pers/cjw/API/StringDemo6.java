package pers.cjw.API;

public class StringDemo6 {
    public static void main(String[] args) {
        //定义一个方法，将字符串逆序

        String str1 = "jbfciqnviebv";
        String str2 = reverseString(str1);
        System.out.println("字符串" + str1 + "的逆序字符串是：" + str2);

    }

    public static String reverseString(String string) {
        String str = "";
        //注意下面的循环条件，之前正序是0到length-1，所以是i=0，i<length，那么length-1到0，就i=length-1，i>=0,有等号才能包含0
        for (int i = string.length() - 1; i >= 0; --i) {
            str = str + string.charAt(i);
        }
        return str;
    }
}
