package day03.member;


import java.time.LocalDate;

//회원 설계도
// 객제치향 중요원칙중 하나 : 단일 책임 원칙. 1개의 클래스는 하나의 책임만 가져라 (SRP)
public class Member {
    int memberId; //회원 식별 번호
    String email; // 이메일 (계정)
    String password; //패스웓,
    String memberName; //회원이름
    Gender gender; //성별
    int age; //나이
    LocalDate regDate; //회원가입일

    public Member(int memberId, String email, String password, String memberName, Gender gender, int age) {
        this.memberId = memberId;
        this.email = email;
        this.password = password;
        this.memberName = memberName;
        this.gender = gender;
        this.age = age;
        this.regDate = LocalDate.now();
    }

    public String inform(){
        String convertGender = this.gender == Gender.MALE? "남성" : "여성";
        return String.format("# %d번 | %s | %s | %s | %d세",
                this.memberId, this.email, this.memberName, convertGender, this.age);


    }
    // 회원 정보를 디테일 출력
    void showDetailInfo() {
        System.out.printf("========= [%s]님 정보 조회 ========\n", this.memberName);
        System.out.println("# 회원번호: " + this.memberId);
        System.out.println("# 이메일: " + this.email);
        System.out.println("# 비밀번호: " + this.password);
        System.out.println("# 성별: " + (this.gender == Gender.MALE ? "남성" : "여성"));
        System.out.println("# 나이: " + this.age + "세");
        System.out.println();
    }
}
