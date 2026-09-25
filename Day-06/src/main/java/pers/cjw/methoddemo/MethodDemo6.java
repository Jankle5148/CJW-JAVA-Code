package pers.cjw.methoddemo;

public class MethodDemo6 {
    public static void main(String[] args) {
        compare(30, 40);
        compare(34.2, 456.4);
        compare((byte) 3, (byte) 6);
        compare((short) 4, (short) 7);
        compare((long) 10000000, (long) 1000000);
    }
    //函数重载
    public static void compare(int n1, int n2) {
        System.out.println(n1 == n2);
    }
    public static void compare(double n1, double n2) {
        System.out.println(n1 == n2);
    }
    public static void compare(short n1, short n2) {
        System.out.println(n1 == n2);
    }
    public static void compare(byte n1, byte n2) {
        System.out.println(n1 == n2);
    }
    public static void compare(long n1, long n2) {
        System.out.println(n1 == n2);
    }
}
