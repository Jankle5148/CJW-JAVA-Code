package pers.cjw.practice;

import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        //数字解密过程：加密的逆过程，需要分析一下
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你要解密的数：");
        int num = sc.nextInt();
        String finalDecryption = getDecryption(num);
        System.out.println("解密后的数是：" + finalDecryption);

    }

    public static String getDecryption(int num) {
        int count = 0;
        while (num >= Math.pow(10, count)) {
            ++count;
        }//先判断这是一个几位数

        int[] decryptArray = new int[count];
        for (int i = 0, count2 = count; i < decryptArray.length; ++i, --count2) {
            decryptArray[i] = (int) ((num / Math.pow(10, count2 - 1))%10);
        }
        //printArray(decryptArray);
        //System.out.println();

        for (int i = 0, j = decryptArray.length - 1; i < j; ++i, --j) {
            int temp = decryptArray[i];
            decryptArray[i] = decryptArray[j];
            decryptArray[j] = temp;
        }//将数组逆序
        //printArray(decryptArray);
        //System.out.println();

        for (int i = 0; i < decryptArray.length; ++i) {
            if(decryptArray[i]<5){
                decryptArray[i]=decryptArray[i]+10;
            }
            decryptArray[i]=decryptArray[i]-5;
        }
        //printArray(decryptArray);
        //System.out.println();

        String finalDecryption = "";
        for (int i = 0; i < decryptArray.length; ++i) {
            finalDecryption = finalDecryption + decryptArray[i];
        }//将数组变成字符串
        return finalDecryption;//返回字符串
    }

//    public static void printArray(int[] arr) {
//        for (int i = 0; i < arr.length; ++i) {
//            System.out.print(arr[i] + " ");
//        }
//    }//打印数组，间隔一个空格

}
