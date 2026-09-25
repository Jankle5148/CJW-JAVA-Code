package pers.cjw.objectproject.goods;

import java.security.spec.ECField;

public class SaveGoods {
    public static void main(String[] args) {

        //定义数组存储三个商品对象
        Goods[] goods = new Goods[3];//定义商品数组

        Goods g1=new Goods("123456","meat",20,100);
        Goods g2=new Goods("112233","fruit",10,50);
        Goods g3=new Goods("654321","vegetable",5,1000);//定义三种商品

        goods[0]=g1;
        goods[1]=g2;
        goods[2]=g3;
        //存进商品数组

        for(int i=0;i<goods.length;++i){
            System.out.printf("商品%s的id是%s，价格是%s元一斤，当前库存为%s",goods[i].getName(),goods[i].getId(),goods[i].getPrice(),goods[i].getCount());
            System.out.println();
        }
    }
}
