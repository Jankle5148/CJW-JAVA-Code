package pers.cjw.API.integer;

public class IntegerDemo3 {
    public static void main(String[] args) {

        //int 转 String
        int number = 100;

        //方式1：当成字符串进行拼接.
        String s1 = number + "";
        System.out.println(s1);

        //方式2：valueOf(int i)
        String s2 = String.valueOf(number);
        System.out.println(s2);

        //==============================================================================================================
        //String 转 int
        String s = "100";

        //方式1：String 转 Integer 转 int
        Integer i = Integer.valueOf(s);
        int x = i.intValue();
        System.out.println(x);

        //方式2：parseInt(String s)
        int y = Integer.parseInt(s);
        System.out.println(y);

    }
}
