package pers.cjw.API.jdk8.zoneIdDemo;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdDemo {
    public static void main(String[] args) {

        //Zone:时区
        //所以ZoneId类：时区类（准确来说是时区号类）

        //Set<string> getAvailableZoneIds() 获取Java中支持的所有时区，返回一个Set
        //ZoneId systemDefault() ：获取当前系统默认时区对象
        //ZoneId of(string zoneId) ：获取某一个一个指定时区对象

        //1.获取所有的时区名称
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);// 打印全部时区
        System.out.println(zoneIds.size());//总共603个时区

        //2.获取当前系统的默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);//GMT+08:00

        //3.获取指定的时区，比如我们要Asia/Pontianak这个时区
        ZoneId zoneId1 = ZoneId.of("Asia/Pontianak");
        System.out.println(zoneId1);//Asia/Pontianak
    }
}
