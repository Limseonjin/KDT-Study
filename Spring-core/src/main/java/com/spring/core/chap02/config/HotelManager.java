package com.spring.core.chap02.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.core.chap02")
//@Component가 붙은 클래스들을 스캔해서 빈으로 자동 등록
public class HotelManager {

}
