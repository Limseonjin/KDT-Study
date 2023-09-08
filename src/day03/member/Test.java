package day03.member;

public class Test {
    public static void main(String[] args) {
        MemberRepository mr = new MemberRepository();
        Member thief = new Member(4, "ttt@gam.com", "9999", "밥도둑", Gender.MALE, 12);

        mr.addMember(thief);
        mr.showMembers();
    }
}
