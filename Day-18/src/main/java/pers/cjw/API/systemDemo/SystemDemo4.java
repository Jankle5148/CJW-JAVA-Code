package pers.cjw.API.systemDemo;

public class SystemDemo4 {
    public static void main(String[] args) {

        //arraycopy方法：数组的定向拷贝
        arrayCopy1();
        arrayCopy2();

    }


    private static void arrayCopy1() {
        // 源数组，长度为5
        int[] arr1 = {23, 45, 67, 89, 14, 56};
        // 目标数组，长度为10，初始值全为0
        int[] arr2 = new int[10];

        // 进行数组元素的copy:
        // 把srcArray数组中0索引的元素，拷贝到desArray数组中的1索引处，连续copy之后的3个。
        System.arraycopy(arr1, 0, arr2, 1, 3);

        // 遍历目标数组
        for (int x = 0; x < arr2.length; x++) {
            if (x != arr2.length - 1) {
                System.out.print(arr2[x] + ", ");
            } else {
                System.out.println(arr2[x]);
            }
        }
        //0, 23, 45, 67, 0, 0, 0, 0, 0, 0
    }


    private static void arrayCopy2() {
        //arraycopy同样可以删除元素，只是用法比较邪门，基本不这么用，java都提示"复制到具有相交范围的同一数组"
        // 定义一个数组
        int[] srcArray = {23, 45, 67, 89, 14, 56};

        // 删除数组中第3个元素(67)：要删除67这个元素，我们只需要将67后面的其他元素依次向前进行移动即可
        System.arraycopy(srcArray, 3, srcArray, 2, 3);

        // 再将最后一个位置的元素设置为0（看情况，有时需要设置多个0）
        srcArray[srcArray.length - 1] = 0 ;

        // 遍历srcArray数组
        for (int x = 0; x < srcArray.length; x++) {
            if (x != srcArray.length - 1) {
                System.out.print(srcArray[x] + ", ");
            } else {
                System.out.println(srcArray[x]);
            }
        }
        //23, 45, 89, 14, 56, 0
        //67被后面的元素覆盖了
    }
}
