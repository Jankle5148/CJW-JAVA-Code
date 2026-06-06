package pers.cjw.API;

public class StringPractice5 {
    public static void main(String[] args) {
        //给一句话，找出这句话的最后一个词，和这个词的长度
        //思路：倒序遍历,遇到第一个空格为止。
        String sentence = "He is still alive";

        int count = 0;//计数器
        StringBuilder sb = new StringBuilder();//装字符
        for (int i = sentence.length() - 1; i >= 0; --i) {
            if (sentence.charAt(i) != ' ') {
                sb.append(sentence.charAt(i));
                ++count;
            } else {
                break;
            }
        }//循环结束，最后一个词的逆序已在sb中
        sb.reverse();//reverse方法将sb中字符再次逆序，得到原单词
        System.out.println("这句话的最后一个词是：" + sb);
        System.out.println("长度为：" + count);
    }
}
