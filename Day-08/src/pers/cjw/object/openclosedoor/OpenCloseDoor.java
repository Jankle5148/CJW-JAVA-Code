package pers.cjw.object.openclosedoor;

public class OpenCloseDoor {
    public static void main(String[] args) {

        Person p2=new Person("陈俊文");
        Door d1=new Door(true);//一个关上的门
        p2.closeDoor(d1);//关门
        p2.openDoor(d1);//开门
        p2.openDoor(d1);//开门
        p2.closeDoor(d1);//关门
        p2.closeDoor(d1);//关门
    }
}
