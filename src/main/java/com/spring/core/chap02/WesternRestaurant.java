package com.spring.core.chap02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@NoArgsConstructor //기본 생성자
@Component("wr") // HotelManager에 객체생성을 맡김
public class WesternRestaurant implements Restaurant {
    //의존 객체
    private final Chef chef;
    private FrenchCourse course = new FrenchCourse();

    @Autowired // 스프링에 빈으로 등록된 의존객체를 알아서 넣어주는 기능
    public WesternRestaurant(@Qualifier("jc") Chef chef){
        this.chef = chef;
    }

    // 요리를 주문하는 기능
    public void order(){
        System.out.println("서양 요리를 주문합니다");
        // 요리 코스 메뉴를 구성해야 함
        course.combineMenu();
        // 요리사에게 요리 명령을 내려야함
        chef.cook();
    }
}
