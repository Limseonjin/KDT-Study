package com.spring.core.chap01;

public class AsianRestaurant implements Restaurant {
    private Chef chef;
    private SushiCourse course = new SushiCourse();

    public AsianRestaurant(Chef chef){
        this.chef = chef;
    }
    public void order(){
        System.out.println("아시안 요리를 주문합니다.");
        course.combineMenu();
        chef.cook();
    }
}
