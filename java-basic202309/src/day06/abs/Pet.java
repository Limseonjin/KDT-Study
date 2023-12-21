package day06.abs;

public abstract class Pet {

    //공통속성
    private String name; //이름
    private String kind; //종
    private int age; //나이


    public Pet(String name, String kind, int age) {
        this.name = name;
        this.kind = kind;
        this.age = age;
    }

    //공통기능 낮잠
    public abstract void takeNap();
    //밥먹는기능
    public abstract void eat();

    public void walk(){}

    //자식객체는 이 내용을 바꾸지말고 그냥 써라
    public final String info(){
        return "hello"+name;
    }
}
