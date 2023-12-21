package day05.poly;


import java.util.Scanner;

//extends Object <= 상속을 안받는 class에 자동으로 상속됨
class A extends Object{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class Basic {
    void test(){
        //다형성 : 자식객체가 부모의 타입을 사용할 수 있다.
        Object a = new A();
        A b = new B();
        A c = new C();
        B d = new D();
        E e = new E();

        Object sc = new Scanner(System.in);
    }

}
