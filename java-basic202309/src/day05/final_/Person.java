package day05.final_;

public class Person {
    String name;
    final String nation; //국적

    //static final -> constant(상수) 처리
    static final double pi = 3.14;

    public Person(String nation) {
        this.nation = nation;
    }
}
