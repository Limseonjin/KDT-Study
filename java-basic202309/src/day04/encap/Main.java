package day04.encap;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("그랜져");
//        myCar.speed = -99999;
//        myCar.mode = 'Z';
        myCar.setSpeed(10);
        System.out.println(myCar.getSpeed());

        myCar.setMode('D');
        System.out.println(myCar.getMode());

//        myCar.inject();
//        myCar.putOil();
//        myCar.pressButton();
//        myCar.moveCylinder();
        myCar.pressButton(); //캡슐화
    }
}
