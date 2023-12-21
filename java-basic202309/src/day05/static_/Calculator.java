package day05.static_;

public class Calculator {
    String color; //계산기 색상
    static double pi; // 원주율

//    원의 넓이를 구하는 메서드
    static double calcAreaCircle(int r){
        return pi*r*r;
    }
    void paint(String color){
        this.color = color;
    }
}
