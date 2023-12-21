package com.spring.core.chap02;

import org.springframework.stereotype.Component;

@Component(value = "jc")
public class JannChef implements Chef {
    public void cook(){
        System.out.println("장 셰프가 프랑스 요리를 합니다.");
    }
}
