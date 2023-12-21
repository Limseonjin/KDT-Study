package day05.poly.car;

public class CarShop {
    //자동차를 고객에게 출고하는 기능
    public Car exportCar(int money){
        if (money == 6000){
            return new Mustang();
        } else if (money == 5000){
            return new Stinger();
        }else if (money == 3000){
            return new Avante();
        }else{
            return null;
        }
    }
}
