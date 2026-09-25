package pers.cjw.polymorphism.polymorphismDemo4;

public class Test {
    public static void main(String[] args) {

        Person p1 = new Person("老王", 30);
        Person p2 = new Person("老李", 25);
        Animal a1 = new Dog(2, "黑色");
        Animal a2 = new Cat(3, "灰色");

        p1.keepPet(a1, "骨头");
        p2.keepPet(a2, "鱼");
    }
}
