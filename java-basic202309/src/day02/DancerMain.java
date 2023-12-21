package day02;

//실행용 클래스 : 메인메서드 생성해서 사용
public class DancerMain {
    public static void main(String[] args) {

        //댄서 객체 생성
        Dancer kim = new Dancer();

        //댄서 객체 초기화
//        kim.dancerName = "김또디안";
//        kim.crewName = "안티티티티";
//        kim.genre = "K-Pop";
        kim.stretch();
        kim.dance();

        System.out.println("=====================");
        Dancer park = new Dancer("뮤","그만훼");
        park.introduce();
        park.dance();

        System.out.println("=====================");
        Dancer hong = new Dancer("홍박사", "틱톡커", Genre.KPOP, DancerLevel.AMATEUR);
        hong.stretch();
        hong.introduce();
        hong.dance();
    }
}
