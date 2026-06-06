package pers.cjw.API.test;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {

        //将三个女朋友进行排序。
        //首先按照年龄升序，如果年龄一样，身高升序，如果身高一样，名字升序
        Girlfriend gf1 = new Girlfriend("xiaoshishi", 18, 1.67);
        Girlfriend gf2 = new Girlfriend("xiaodandan", 19, 1.72);
        Girlfriend gf3 = new Girlfriend("xiaohuahua", 19, 1.78);
        Girlfriend gf4 = new Girlfriend("azhen", 19, 1.78);
        Girlfriend gf5 = new Girlfriend("aqiang", 20, 1.87);

        Girlfriend[] arr = {gf1, gf2, gf3, gf4, gf5};


        //排序。
        Arrays.sort(arr, (o1, o2) -> {
            int temp1 = o1.getAge() - o2.getAge();
            //计算年龄差，如果temp1!=0，说明两人年龄不同，一定能排序
            if (temp1 != 0) {
                return temp1;
            }

            //如果能运行到这，说明年龄相同。接下来比身高
            double temp2 = o1.getHeight() - o2.getHeight();
            if (temp2 < 0) {
                return -1;
            } else if (temp2 > 0) {
                return 1;
            }

            //如果能运行到这，说明身高也相同。接下来比名字
            int temp3 = o1.getName().compareTo(o2.getName());
            if (temp3 != 0) {
                return temp3;
            }

            //如果能运行到这，说明上面三项都比不出来，于是保持原位。
            return 0;

        });

        //打印数组
        System.out.println(Arrays.toString(arr));

    }
}
