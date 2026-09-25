package pers.cjw.innerClassDemo2;

public class Outer {

    String name;

    private static class Inner {
        static int a = 10;
    }

    public Inner getInner() {
        return new Inner();
    }

}
