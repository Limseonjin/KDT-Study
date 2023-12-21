package com.spring.core.chap02;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ar")
public class AsianRestaurant implements Restaurant {
    private Chef chef;
    private SushiCourse course = new SushiCourse();

    public AsianRestaurant(@Qualifier("kc") Chef chef){
        this.chef = chef;
    }
    public void order(){
        System.out.println("아시안 요리를 주문합니다.");
        course.combineMenu();
        chef.cook();
    }
}
