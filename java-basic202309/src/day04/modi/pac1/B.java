package day04.modi.pac1;

//import day04.modi.pac2.D;

public class B {
    public B() {
        A a = new A();
        new A(10);
//        new A("dsf"); // 접근불가
        a.f1 = 1;
        a.f2 = 2;
//        a.f3 = 3; //접근불가

        a.m1();
        a.m2();
//        a.m3(); //접근불가

//        new D(); //class가 default라 접근불가
    }

}
