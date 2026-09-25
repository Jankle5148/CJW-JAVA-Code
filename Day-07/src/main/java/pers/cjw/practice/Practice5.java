package pers.cjw.practice;

public class Practice5 {
    public static void main(String[] args) {
        //复制数组
        int[] arr1=new int[]{1,2,3,4,5};
        int[] arr2=new int[arr1.length];

        for(int i=0;i<arr1.length;++i){
            arr2[i]=arr1[i];
            System.out.print(arr1[i]);
        }//赋值，并打印数组1

        System.out.println();
        for(int i=0;i<arr2.length;++i){
            System.out.print(arr2[i]);
        }//打印数组2

    }
}
