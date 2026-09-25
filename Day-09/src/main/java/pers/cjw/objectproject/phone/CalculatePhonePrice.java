package pers.cjw.objectproject.phone;

public class CalculatePhonePrice {
    public static void main(String[] args) {
        //定义数组存储三部手机对象，计算手机的平均价格
        Phone[] phones = new Phone[3];
        Phone p1 = new Phone("苹果", 4799, "绿色");
        Phone p2 = new Phone("小米", 3599, "白色");
        Phone p3 = new Phone("华为", 6599, "黑色");

        phones[0] = p1;
        phones[1] = p2;
        phones[2] = p3;

        double sum = 0.0;
        for (int i = 0; i < phones.length; ++i) {
            sum += phones[i].getPrice();
        }

        double avgPrice = sum / phones.length;
        System.out.println("这三部手机的平均价格是：" + avgPrice + "元");
    }
}
