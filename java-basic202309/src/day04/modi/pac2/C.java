package day04.modi.pac2;

import day04.modi.pac1.A;

public class C {
    public C() {
        A a = new A();
//        new A(1); // default 접근불가
//        new A("Dd") // private 접근불가

        a.f1 = 1;
//        a.f2 = 2; //접근불가
//        a.f3 = 3; //접근불가

        a.m1();
//        a.m2(); //접근불가
//        a.m3(); //접근불가
    }
}
