package day05.static_;

public class Count {

    // 제한자 (modifier)
    // 접근제한자 (access modifier), 사용 제한자(usage)

    public static int x; //정적필드: 모든객체가 공유
    public int y; //인스턴스 필드 : 각 객체별로 관리됨

    //static 정적 메서드
    //static 메서드 안에서는 static필드만 직접 참조 가능
    //인스턴트 필드는 객체를 명시적으로 밝혀야 가능
    public static void m1(Count c){
        System.out.println("staic메서드 호출");
        System.out.println("x = " + x);
        System.out.println("y = " + c.y); //this를 못 찾음
    }
    //인스턴스 메서드
    public void m2(){
        System.out.println("인스턴스 메서드 호출");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
