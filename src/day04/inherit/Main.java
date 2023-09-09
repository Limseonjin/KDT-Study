package day04.inherit;

public class Main {
    public static void main(String[] args) {
        Warrior w = new Warrior("주차왕피킹");
        Mage m = new Mage("충격왕쇼킹");
        Hunter h = new Hunter("요리왕쿠킹");

        w.status();
        m.status();
        h.status();

        System.out.println("==============");

        new Student();
    }
}
