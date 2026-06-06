package shousi;

public class Test01 {
    public static void main(String[] args) {
        String[] strings = {"III", "IV", "IX", "LVIII", "MCMXCIV"};
        for (String s : strings) {
            System.out.println(t(s));
        }
    }
    // 现场编程题题目内容：
    // 1s. 编程题目（面试官出的考核题目）
    // 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。对应关系如下：
    // 字符：[I,V, X, L, C,  D,  M]
    // 数值：[1,5,10,50,100,500,1000]
    // 例如，罗马数字2 写做 II，即为两个并列的1。12写做 XII，即为 X + II 。27写做 XXVII,即为 XX + V + II。
    // 通常情况下，罗马数字中小的数字在大的数字的右边。
    // 但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 - 小数 1，得到数值 4。同样地，数字 9 表示为 IX。
    // 这个特殊的规则只适用于以下六种情况：
    // I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
    // X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
    // C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。

    // 给定一个罗马数字，将其转换成整数。
    // 输入: s = "III"
    // 输出: 3

    // 输入: s = "IV"
    // 输出: 4

    // 输入: s = "IX"
    // 输出: 9

    // 输入: s = "LVIII"
    // 输出: 58，因为L = 50, V= 5, III = 3.
    // 解释:

    // 输入: s = "MCMXCIV"
    // 输出: 1994，因为M = 1000, CM = 900, XC = 90, IV = 4.

    // 1 <= s.length <= 15
    // s 仅含字符 ('I', 'V', 'X', 'L', 'C', 'D', 'M')
    // 题目数据保证 s 是一个有效的罗马数字，且表示整数在范围 [1, 3999] 内
    // 题目所给测试用例皆符合罗马数字书写规则，不会出现跨位等情况。
    // IL 和 IM 这样的例子并不符合题目要求，49 应该写作 XLIX，999 应该写作 CMXCIX 。
    // 关于罗马数字的详尽书写规则，可以参考 罗马数字 - Mathematics 。
    //字符转换规则
    private static int v(char c) {
        int v = 0;
        switch (c) {
            case 'I': v = 1; break;
            case 'V': v = 5; break;
            case 'X': v = 10; break;
            case 'L': v = 50; break;
            case 'C': v = 100; break;
            case 'D': v = 500; break;
            case 'M': v = 1000; break;
            default: break;
        }
        return v;
    }

    private static int t(String s) {
        int n = s.length();
        int r = 0;
        for (int i = 0; i < n; i++) {
            int cur = v(s.charAt(i));//当前数字
            int nxt = (i + 1 < n) ? v(s.charAt(i + 1)) : 0;//下一个数字
            r += cur < nxt ? -cur : cur;
            //通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例.
        }
        return r;
    }

}
