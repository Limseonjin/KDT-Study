package com.spring.core.chap01;

import com.spring.core.chap01.config.HotelManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    void hotelTest(){
//        Hotel hotel = new Hotel();
//        hotel.reserve();

        HotelManager hm = new HotelManager();
        Hotel hotel = hm.hotel();

        hotel.reserve();
    }
}