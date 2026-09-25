package pers.cjw.regexAPI;

public class RegexDemo12 {
    public static void main(String[] args) {

        //需求1:判断一个字符串的 第一个字符 和 最后一个字符 是否一致?
        //举例: a123a b456b 17891 &abc& a123b，最后一个为false，其余为true

        // \\组号:表示把第X组的内容再出来用一次
        //从左到右，左括号的顺序就是分组的顺序

        //(.)为第一个括号，也就是第1组，组内的内容是一个点.也就是单个任意字符
        //.+为任意多个任意字符
        //\\1：与第一组内容相同

        String regex1 = "(.).+\\1";
        System.out.println("------------1-----------");
        System.out.println("a123a".matches(regex1));
        System.out.println("b456b".matches(regex1));
        System.out.println("17891".matches(regex1));
        System.out.println("&abc&".matches(regex1));
        System.out.println("a123b".matches(regex1));

        //==============================================================================================================

        //需求2:判断一个字符串的 开始部分 和 结束部分 是否一致?可以有多个字符。
        //举例: abc123abc b456b 123789123 &!@abc&!@ abc123abd，最后一个为false，其余为true
        //(.+)：第一组内容为任意多个任意字符
        //.+：任意多个任意字符
        //\\1：与第一组内容相同

        String regex2 = "(.+).+\\1";
        System.out.println("------------2-----------");
        System.out.println("abc123abc".matches(regex2));
        System.out.println("b456b".matches(regex2));
        System.out.println("123789123".matches(regex2));
        System.out.println("&!@abc&!@".matches(regex2));
        System.out.println("abc123abd".matches(regex2));

        //==============================================================================================================

        //需求3:判断一个字符串的 开始部分 和 结束部分 是否一致? 并且开始部分内部每个字符也需要一致。
        //举例: aaa123aaa bbb456bbb 111789111 &&abc&& aaa123aab，最后一个为false，其余为true
        //(.):组内为单个任意字符，但这一组其实是第二组，为什么？因为它的左括号，是从左往右数第二个左括号。
        // \\2*:第二组拿出来再次使用。*作用于\\2,代表使用0次或多次
        //上面两部分用括号括起形成第1组，即((.)\2*)，即第1组内为任意多个相同字符

        //.+：任意多个任意字符
        //\\1：与第一组内容相同

        String regex3 = "((.)\\2*).+\\1";
        System.out.println("------------3-----------");
        System.out.println("aaa123aaa".matches(regex3));
        System.out.println("bbb456bbb".matches(regex3));
        System.out.println("111789111".matches(regex3));
        System.out.println("&&abc&&".matches(regex3));
        System.out.println("aaa123aab".matches(regex3));

    }
}
