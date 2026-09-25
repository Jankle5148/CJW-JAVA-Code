package pers.cjw.object.openclosedoor;

public class Person {
    String name;

    public Person(){
    }//无参构造，new一个空壳人

    public Person(String name){
        this.name=name;
    }//有参构造，new一个名为name的人

    public void closeDoor(Door door){
        if(!door.status){
            door.close();
            System.out.println(this.name+"把门关上了");
        }else{
            System.out.println("不用关门，门已经关了");
        }
    }

    public void openDoor(Door door){

        if(door.status){
            door.open();
            System.out.println(this.name+"把门打开了");
        }else{
            System.out.println("不用开门，门已经开了");
        }
    }

}
