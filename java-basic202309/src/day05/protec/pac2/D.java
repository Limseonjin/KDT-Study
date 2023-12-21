package day05.protec.pac2;

import day04.modi.pac1.A;

public class D extends A {
    public D() {
        super();
//        new A(1); 상속은 생성자는 public만
//        new A("");
        this.f1 = 1;
//        this.f2 = 2; // default 접근제한
        this.m1();
//        this.m2(); //접근제한

    }
}
