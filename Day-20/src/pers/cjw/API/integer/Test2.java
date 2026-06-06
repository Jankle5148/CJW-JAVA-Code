package pers.cjw.API.integer;

public class Test2 {
    public static void main(String[] args) {

        //Test2：实现一个和 parseInt 方法效果相同的办法，将字符串形式的数据转成整数。
        //要求:字符串中只能是数字，不能有其他字符，最少一位，最多10位，0不能开头

        //定义一个字符串
        String str = "123";
        System.out.println(method(str));

    }

    private static int method(String str) {

        //校验字符串,先把异常数据进行过滤，剩下来就是正常的数据。
        if (!str.matches("[1-9]\\d{0,9}")) {//以1-9开头，\\d即任何数重复9次

            //如果不符，为错误的数据
            System.out.println("数据格式有误");
            return 0;

        }

        //能运行到这说明是正确的数据
        System.out.println("数据格式正确");

        //定义一个number表示最终的结果
        int number = 0;

        //遍历字符串得到里面的每一个字符
        for (int i = 0; i < str.length(); i++) {
            //char转int的简易办法：ascii值相减
            int c = str.charAt(i) - '0';
            //把每一位数字放到number当中
            number = number * 10 + c;
        }

        return number;

    }


}
