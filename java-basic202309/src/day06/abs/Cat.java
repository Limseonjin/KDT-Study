package day06.abs;

public class Cat extends Pet{
    public Cat(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void takeNap() {
        System.out.println("고양이 잔다");
    }
    public void eat(){
        System.out.println("고양이는 먹는다");
    }
}
