package day04.modi.pac1;

public class A {    // 클래스의 구성요소 (class member)
    // 필드
    public int f1;
    int f2;         // default제한이 걸림
    private int f3;

    // 생성자
    public A() {

        f1 = 1;
        f2 = 2;
        f3 = 3;

        new A();
        new A(10);
        new A("dd");

        m1(); m2(); m3();

    }
    A(int a) {

    }
    private A(String b) {

    }

    // 메서드
    public void m1() {}
    void m2() {}
    private void m3() {}
}
