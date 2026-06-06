package pers.cjw.methoddemo;

public class MethodDemo1 {
    public static void main(String[] args) {
        System.out.println("hello world！");
        playGame();
        playGame2();
    }

    //重复性的代码，放在main方法外面，类里面，单独封装成方法，可供main函数使用。与c++无异
    //形如 public static 方法类型 方法名（......）{......}
    public static void playGame() {
        System.out.println("选人物：");
        System.out.println("开始执行：");
    }

    //理论上可以方法套方法套方法，反正看到方法就转到方法那，如下：
    public static void playGame2() {
        playGame3();
    }
    //选中方法的第一个大括号，ctrl加-，就可以折叠方法在一行

    public static void playGame3() {
        playGame4();
    }

    public static void playGame4() {
        System.out.println("你被骗了！");
    }
}
