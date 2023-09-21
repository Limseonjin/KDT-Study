package day08.generic;

import day04.modi.pac1.B;
import util.Utility;

public class Main {
    public static void main(String[] args) {
        Apple a1 = new Apple(10);
        System.out.println(a1.toString());

        AppleBasket ab = new AppleBasket();
        ab.setApple(a1);
        Apple apple = ab.getApple();

        Banana b1 = new Banana();
//        ab.setApple(b1); 사과에 바나나 X
        BananaBasket bb = new BananaBasket();
        bb.setBanana(b1);

        Basket<Apple> appleBasket = new Basket<>();
        appleBasket.setFruit(new Apple(1));
        Apple fruit = appleBasket.getFruit();

        Basket<Banana> bananaBasket = new Basket<>();
        bananaBasket.setFruit(new Banana());
        Banana fruit1 = bananaBasket.getFruit();

        Basket<Peach> peachBasket = new Basket<>();

        Utility.makeLine();
        GenricList<String> sList = new GenricList<>();
        sList.push("짬장");
        sList.push("짬뽕");
        sList.push("짬면");

        sList.printArray();

        GenricList<Integer> numbers = new GenricList<>();
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);

        numbers.printArray();

        GenricList<Apple> appleGenricList = new GenricList<>();
        appleGenricList.push(new Apple(17));
        appleGenricList.push(new Apple(13));
        appleGenricList.push(new Apple(11));
        appleGenricList.printArray();


    }
}
