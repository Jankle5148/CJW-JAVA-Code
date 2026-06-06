package pers.cjw.arraydemo;

public class ArrayDemo4 {
    public static void main(String[] args) {
        //一个数组存储1-100,并将其中的奇数变为2倍，将其中的偶数变为1/2

        int[] p = new int[100];//动态初始化，只定义数组长度，不初始化值，系统分配初始值
        for (int i = 0; i < 100; ++i) {
            p[i] = i + 1;//0号元素是1，1号元素是2，以此类推
            if (p[i] % 2 != 0) {
                p[i] = 2 * p[i];
            } else {
                p[i] = p[i] / 2;
            }
        }
        //其实可以优化，因为其中的p[i]被连续赋值了两次，可以直接p[i] = 2 * (i+1)

        for (int i = 0; i < 100; ++i) {
            System.out.println(p[i]);
        }
    }
}
