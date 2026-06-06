package pers.cjw.object.openclosedoor;

public class Door {
    boolean status;

    public Door(){}//无参构造，new一个不知道status的门

    public Door(boolean status){
        this.status=status;//true代表关上，false代表没关上
    }//有参构造，new一个状态为status的门

    public void setStatus(boolean status){
        this.status=status;
    }//修改门的状态

    public void close(){
        if(!this.status){
            this.status=true;
        }
    }

    public void open(){
        if(this.status){
            this.status=false;
        }
    }

}
