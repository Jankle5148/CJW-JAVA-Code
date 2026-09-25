package pers.cjw.API;

public class StringDemo10 {
    public static void main(String[] args) {
        //替换铭感词
        //替换方法replace(旧词，新词)，返回值是修改后的字符串
        String sentence1 = "操你妈，打的什么狗屎。";
        String str1 = sentence1.replace("操你妈", "cnm");
        System.out.println(str1);

        //如果敏感词特别多怎么办？
        //定义一个敏感词库，有多少个敏感词，就将句子扫描多少次，碰到敏感词，替换
        String[] arr = {"cnm", "tmd", "mlgb", "nmsl", "sb"};

        String sentence2 = "你个sb我cnm，tmd，会不会打啊mlgb，nmsl。";
        for (int i = 0; i < arr.length; ++i) {
            sentence2 = sentence2.replace(arr[i], "***");
        }
        System.out.println(sentence2);
        //以后有了新的敏感词，直接加入敏感词库即可
    }
}
