package pers.cjw.regexAPI;

public class RegexDemo4 {
    public static void main(String[] args) {

        //使用RegexDemo2中的正则表达式太过繁琐，为了简化，将一些常用正则表达式进行了预定义

        //（1）.表示任意一个字符
        //几个.代表连续的任意字符
        System.out.println("-----------1-------------");
        System.out.println("你".matches("..")); //'你'是两个字吗？false
        System.out.println("你".matches(".")); //'你'是一个字吗？true
        System.out.println("你a".matches(".."));//'你a'是两个字吗？true

        //（2）\\d: 任意的一个数字
        // 简单来记:两个\表示一个\
        System.out.println("-----------2-------------");
        System.out.println("a".matches("\\d")); // a是任意的一个数字吗？false
        System.out.println("3".matches("\\d")); // 3是任意的一个数字吗？true
        System.out.println("333".matches("\\d")); // 333是任意的一个数字吗？false

        //（3）\\w: 任意一位单词字符[a-zA-Z_0-9]：即a-z 或 A-Z 或 下划线 或 0-9
        System.out.println("-----------3-------------");
        System.out.println("z".matches("\\w")); // true
        System.out.println("2".matches("\\w")); // true
        System.out.println("21".matches("\\w")); // false
        System.out.println("你".matches("\\w"));//false

        //（4）\\W: 非单词字符，相当于\\w取反
        System.out.println("-----------4-------------");
        System.out.println("你".matches("\\W")); // true

        //==============================================================================================================
        //以上均检测单个字符，详检测多字符，用组合技
        //1. ? : 0次或1次
        //2. * : 0次到多次
        //3. + : 1次或多次
        //4. {n} : 恰好n次
        //5. {n,} : 至少n次
        //6. {n,m}: n到m次(n和m都是包含的)

        // (5) 至少6次，必须是单词字符
        System.out.println("-----------5-------------");
        System.out.println("2442fsfsf".matches("\\w{6,}"));//true
        System.out.println("244f".matches("\\w{6,}"));//false

        // （6）必须是4次，数字和字母
        System.out.println("-----------6-------------");
        System.out.println("23dF".matches("[a-zA-Z0-9]{4}"));//true
        System.out.println("23 F".matches("[a-zA-Z0-9]{4}"));//false
        System.out.println("23dF".matches("[\\w&&[^_]]{4}"));//true
        System.out.println("23_F".matches("[\\w&&[^_]]{4}"));//false

        // （7）前3次满足0-9，中间4次满足a-z，后面5次满足A-Z
        System.out.println("-----------7-------------");
        System.out.println("341handEQNSF".matches("[0-9]{3}[a-z]{4}[A-Z]{5}"));//true
        System.out.println("23 gwgrxcvsF".matches("[0-9]{3}[a-z]{4}[A-Z]{5}"));//false
        System.out.println("23efdfvdvvdF".matches("[0-9]{3}[a-z]{4}[A-Z]{5}"));//false
        System.out.println("23_ebvdvsdvF".matches("[0-9]{3}[a-z]{4}[A-Z]{5}"));//false
    }
}
