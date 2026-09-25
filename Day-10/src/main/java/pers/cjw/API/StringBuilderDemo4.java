package pers.cjw.API;

public class StringBuilderDemo4 {
    public static void main(String[] args) {
        //将int数组，拼接成字符串，再以特定形式返回。
        //比如int[] arr={1,2,3};
        //输出[1,2,3]
        //使用stringBuilder.

        int[] arr = {1, 2, 3};
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; ++i) {
            if (i != arr.length - 1) {
                sb.append(arr[i]).append(",");
            } else {
                sb.append(arr[i]);
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

}
