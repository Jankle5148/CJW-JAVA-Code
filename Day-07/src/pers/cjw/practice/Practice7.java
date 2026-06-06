package pers.cjw.practice;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        //数字加密过程：（1）每一位+5再对10求余，得到新的位.（2）将得到的数字逆序
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你要加密的数：");
        int num = sc.nextInt();
        String finalEncryption = getEncryption(num);
        System.out.println("加密后的密码是：" + finalEncryption);

    }

    public static String getEncryption(int num) {
        int count = 0;
        while (num >= Math.pow(10, count)) {
            ++count;
        }//先判断这是一个几位数

        int[] encryptArray = new int[count];
        for (int i = 0, count2 = count; i < encryptArray.length; ++i, --count2) {
            encryptArray[i] = (int) ((num / Math.pow(10, count2 - 1) + 5) % 10);
        }//得到加5对10取余后的各位数的数组
        //printArray(encryptArray);
        //System.out.println();

        for (int i = 0, j = encryptArray.length - 1; i < j; ++i, --j) {
            int temp = encryptArray[i];
            encryptArray[i] = encryptArray[j];
            encryptArray[j] = temp;
        }//将数组逆序
        //printArray(encryptArray);
        //System.out.println();

        String finalEncryption = "";
        for (int i = 0; i < encryptArray.length; ++i) {
            finalEncryption = finalEncryption + encryptArray[i];
        }//将数组变成字符串
        return finalEncryption;//返回字符串
    }

//    public static void printArray(int[] arr) {
//        for (int i = 0; i < arr.length; ++i) {
//            System.out.print(arr[i] + " ");
//        }
//    }//打印数组，间隔一个空格

}
