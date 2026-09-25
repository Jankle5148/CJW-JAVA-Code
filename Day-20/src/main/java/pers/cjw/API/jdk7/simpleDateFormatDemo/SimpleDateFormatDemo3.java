package pers.cjw.API.jdk7.simpleDateFormatDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo3 {
    public static void main(String[] args) throws ParseException {

        //秒杀活动开始时间:2023年11月11日 0:0:0(毫秒值)
        //秒杀活动结束时间:2023年11月11日 0:10:0(毫秒值)

        //小贾下单并付款的时间为:2023年11月11日 0:01:0
        //小皮下单并付款的时间为:2023年11月11日 0:11:0
        //用代码说明这两位同学有没有参加上秒杀活动?

        System.out.println("小贾" + method("2023年11月11日 0:01:0"));
        System.out.println("小皮" + method("2023年11月11日 0:11:0"));
    }

    private static String method(String orderStr) throws ParseException {
        //1.定义字符串表示三个时间:开始时间、结束时间
        String startStr = "2023年11月11日 0:0:0";
        String endStr = "2023年11月11日 0:10:0";

        //2.根据我们自定义的格式，解析上面的2个时间，和传参下单时间，得到三个Date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        Date startDate = sdf.parse(startStr);
        Date endDate = sdf.parse(endStr);
        Date orderDate = sdf.parse(orderStr);

        //3.得到三个时间的毫秒值。
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long orderTime = orderDate.getTime();

        //4.判断，如果下单时间在开始时间和结束时间之间，则成功，反之失败
        if (orderTime >= startTime && orderTime <= endTime) {
            return "参加秒杀活动成功";
        } else {
            return "参加秒杀活动失败";
        }
    }

}
