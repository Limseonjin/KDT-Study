package day02;

public class Dancer {

    // 객체의 속성 (필드)
    String dancerName; // 댄서 이름
    String crewName; // 팀 이름
    Genre genre; // 장르
    DancerLevel danceLevel; // 댄스 수준 (0: 초보, 1: 중수, 2: 고수)

    //생성자 선언 : 객체의 초기값을 세팅
    //생성자도 함수의 일종, 리턴데이터가 주소값으로 고정
    //따라서 리턴 타입을 적지 않음
    Dancer(){
        dancerName = "김뽀삐";
        crewName = "헬로우";
        danceLevel = DancerLevel.BEGINNER;
        genre = Genre.URBAN;
    }
    Dancer(String dName){
        dancerName = dName;
        crewName = "굿바이";
        danceLevel = DancerLevel.BEGINNER;
        genre = Genre.HIPHOP;
    }
    Dancer(String dName, String cName){
        dancerName = dName;
        crewName = cName;
        danceLevel = DancerLevel.BEGINNER;
        genre = Genre.HIPHOP;
    }

    public Dancer(String dancerName, String crewName, Genre genre, DancerLevel danceLevel) {
        this.dancerName = dancerName;
        this.crewName = crewName;
        this.genre = genre;
        this.danceLevel = danceLevel;
    }

    // 객체의 기능 (메서드) : static을 붙이지 말 것
    // 춤추는 기능
    void dance() {
        System.out.println(genre.getGenreName() + "춤을 열정적으로 춥니다.");
    }
    // 스트레칭을 하는 기능
    void stretch() {
        System.out.println(dancerName + "님이 몸을 풉니다.");
    }
    // 자기소개하는 기능
    void introduce() {
        System.out.printf("내 이름은 %s이고 %s팀에 소속되어 있습니다.\n"
                , dancerName, crewName);
    }


}
