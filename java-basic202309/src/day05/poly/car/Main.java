package day05.poly.car;

import day04.modi.pac2.C;
import util.Utility;

public class Main {
    public static void main(String[] args) {
        Avante avante = new Avante();
        Avante avante2 = new Avante();
        Mustang mustang = new Mustang();
        mustang.exhaust();
        Car stinger = new Stinger();

        Car[] cars = {avante, avante2,mustang,stinger};
        for (Car car : cars) {
            car.accelerate();
        }

        Object[] arr = {"hello",10,false,"11"};

        Utility.makeLine();

        Driver park = new Driver();
        park.drive(new Mustang());
        park.drive(new Stinger());

        Utility.makeLine();
        CarShop carShop = new CarShop();

        //다운캐스팅이라서 형을 지정해줘야함
        Mustang myCar = (Mustang) carShop.exportCar(6000);
        myCar.accelerate();
        myCar.exhaust();

        //자동 형변화
        Car[] myCarList = {myCar};

        //객체의 다운캐스팅은 전제조건이 있음
        //한번 업캐스팅이 된 자식객체만 다시 다운캐스팅 가능
        Car myStinger = new Stinger();
        Stinger ss = (Stinger)myStinger;

//        Car car = new Car();
//        Avante aaa = (Avante) car; 캐스팅 안됌

        Utility.makeLine();
        Car car2 = carShop.exportCar(5000);
        System.out.println(car2 instanceof Avante);
        System.out.println(car2 instanceof Stinger);
        System.out.println(car2 instanceof Mustang);

        if (car2 instanceof Mustang){
            Mustang ms = (Mustang) car2;
            ms.exhaust();
        }

    }
}
