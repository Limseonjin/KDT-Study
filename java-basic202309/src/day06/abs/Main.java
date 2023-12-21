package day06.abs;

public class Main {
    public static void main(String[] args) {
//        new Pet("없음","몰라",0); //추상클래스여서 생성X

        Dog dog = new Dog("해피","푸들",3);
        Cat cat = new Cat("랑이","코숏",2);
        Pet[] pets = {dog, cat, new Dog("초코","말티즈",4)};

        for (Pet pet : pets) {
            pet.eat();
        }
    }
}
