package pers.cjw.abAndImpDemo1;

public class Test {
    public static void main(String[] args) {

//    乒乓球运动员：姓名，年龄，学打乒乓球，说英语
//    乒乓球教练：姓名，年龄，教打乒乓球，说英语
//    篮球运动员：姓名，年龄，学打篮球
//    篮球教练：姓名，年龄，教打篮球
//
//    结构如下:（方式不唯一）

//    Person人类：姓名、年龄。
//
//    SpeakEnglish接口：说英语，有方法体的方法。
//
//    Player运动员类：继承Person人类，,含有一个抽象方法learn，构造时调用父类方法构造。
//    Coach教练类：继承Person人类，含有一个抽象方法teach，构造时调用父类方法构造。
//
//    TableTennisPlayer乒乓球运动员：继承Player运动员类，实现SpeakEnglish接口，重写learn方法，构造时调用父类方法构造。
//    BasketballPlayer篮球运动员：继承Player运动员类，重写learn方法，构造时调用父类方法构造。
//    TableTennisCoach乒乓球教练：继承Coach教练类，实现SpeakEnglish接口，重写teach方法，构造时调用父类方法构造。
//    BasketballCoach篮球教练：继承Coach教练类，重写teach方法，构造时调用父类方法构造。


        TableTennisPlayer ttp = new TableTennisPlayer("樊振东", 27);
        System.out.println(ttp.getName() + "今年" + ttp.getAge() + "岁。");
        ttp.learn();
        ttp.speakEnglish();

    }
}
