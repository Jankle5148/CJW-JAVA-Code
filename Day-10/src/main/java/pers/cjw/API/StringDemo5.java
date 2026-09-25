package pers.cjw.API;

public class StringDemo5 {
    public static void main(String[] args) {
        //将int数组，拼接成字符串，再以特定形式返回。
        //比如int[] arr={1,2,3};
        //输出[1,2,3]

        int[] arr = {1, 2, 3};
        String str = printInt(arr);
        System.out.println(str);

    }

    public static String printInt(int[] arr) {
        if (arr == null) {
            return "";
        }
        String str = "";
        str = str + "[";
        for (int i = 0; i < arr.length; ++i) {
            if (i != arr.length - 1) {
                str = str + arr[i] + ",";
            } else {
                str = str + arr[i];
            }
        }
        str = str + "]";
        return str;
    }
}
