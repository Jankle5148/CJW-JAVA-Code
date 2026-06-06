package pers.cjw.regexAPI;

public class RegexDemo1 {
    public static void main(String[] args) {

        //正则表达式：
        //假如现在要求校验一个qq号码是否正确。规则:qq号>6位,<20位，0不能在开头，全部是数字 。

        String qq = "1234567890";

        //1.通过自己写方法，来判断。
        System.out.println(checkQQ(qq));

        //2.通过正则表达式判断。（match：符合、匹配）
        System.out.println(qq.matches("[1-9]\\d{5,19}"));
        //[1-9]：表示字符串的第一个字符，必须是1到9之间的数字，不能为0。
        //\\d{5,19}：表示接下来的字符，必须是5到19位的数字（\\d 表示一个数字字符，相当于 [0-9]；{5,19} 表示重复5到19次）。

    }

    public static boolean checkQQ(String qq) {
        //规则:qq号>6位,<20位，0不能在开头，全部是数字 。

        //获取长度
        int len = qq.length();

        //如果长度不符合，返回false
        if (len < 6 || len > 20) {
            return false;
        }
        //如果0在开头，返回false
        if (qq.startsWith("0")) {
            return false;
        }
        //如果不全是数字，返回false
        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if (c < '0' | c > '9') {
                return false;
            }
        }
        //如果能运行到这，说明没有问题，返回true
        return true;
    }
}
