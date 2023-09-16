package day07.inter;


//class : 객체를 만나드는 설계도
// interface: 클래스를 만드는 명세서
public interface Animal {
    //필드선언 불가능
    //생성자 선언 불가능

    //상수만 선언 가능
    String PET = "커여운 동물";

    //기능들을 명세
    void feed(String foodName); //public abstract가 자동으로 붙음
    public abstract boolean sleep();

    default void makeHobby() {} //비 강제적으로 오버라이딩 가능

}
