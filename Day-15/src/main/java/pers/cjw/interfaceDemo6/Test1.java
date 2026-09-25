package pers.cjw.interfaceDemo6;

public class Test1 {
    public static void main(String[] args) {

//        jdk9之后，接口内可以定义私有private方法，这个方法只能接口内的其他方法进行调用，外部类无法调用
//        比如show1方法和show2方法有相当重复的部分，那么抽取出来做一个新的show方法，然后show1和show2进行调用即可，。
//        但是这个show又不想外部类调用，或者外部类调用它没有意义，所以把他定义成private。

//        两个规则：
//        （1）default方法调用私有方法，私有方法只用写private即可
//        （2）static方法调用私有方法，私有方法要写成private static，很简单，因为我是不会变的，我调用你，那么我确保你也不能变

//        定义一个接口
//        public interface Inter {
//
//            public default void show1(){
//                System.out.println("接口内的show1方法");
//                show3();
//            }
//
//            public static void show2(){
//                System.out.println("接口内的show2方法");
//                show4();
//            }
//
//            private void show3() {
//                System.out.println("100行代码");
//            }
//
//            private static void show4() {
//                System.out.println("100行代码");
//            }
//
//        }

//        但是因为jdk17不知道什么问题，private代码跑不出来，于是用注释说明

    }
}
