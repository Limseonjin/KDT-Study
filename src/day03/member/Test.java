package day03.member;

public class Test {
    public static void main(String[] args) {
        MemberRepository mr = new MemberRepository();
        Member thief = new Member(4, "ttt@gam.com", "9999", "밥도둑", Gender.MALE, 12);

        mr.addMember(thief, true);
        mr.showMembers();

        System.out.println("=========");
        String email = "ttt@gam.com";
//        boolean flag1 = mr.isDuplicatedEmail(email);
//        System.out.println("flag1 = " + flag1);
//
//        Member foundMember = mr.findMemberByEmail(email);
//        System.out.println("foundMember.inform() = " + foundMember.inform());

        mr.removeMember(thief);

        mr.printRemoveMembers();
    }
}
