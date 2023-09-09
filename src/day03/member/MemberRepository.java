package day03.member;


import java.util.Arrays;

//책임(역할) : 회원을 여러명 저장관리하는 클래스
public class MemberRepository {
    Member[] memberList; //가입된 회원 배열
    Member[] removeMembers; //삭제된 회원 배열

    public MemberRepository() {
        this.memberList = new Member[]{
                new Member(1,"abc@def.com","1234","콩벌레",Gender.FEMALE,23),
                new Member(2,"bbb@def.com","1234","팥죽이",Gender.MALE,21),
                new Member(3,"ccc@def.com","1234","카레멘",Gender.MALE,20),
                new Member(4,"eee@def.com","1234","카레멘",Gender.MALE,20),
                new Member(5,"ddd@def.com","1234","카레멘",Gender.MALE,20),
                new Member(6,"fff@def.com","1234","카레멘",Gender.MALE,20),
                new Member(7,"ggg@def.com","1234","카레멘",Gender.MALE,20),
                new Member(8,"qqq@def.com","1234","카레멘",Gender.MALE,20),
                new Member(9,"vvv@def.com","1234","카레멘",Gender.MALE,20),
        };
        this.removeMembers = new Member[0];
    }
    /*
    * 회원 배열의 사이즈를 출력하는 메서드
    * */
    int showMemberListSize(Member[] members){
        return members.length;
    }
     /*
     * 모든 회원 정보를 출력하는 메서드
     * */
    void showMembers(){
        System.out.printf("========현재 회원정보 ( 총 %d명 )==============\n",memberList.length);
        for (Member member : memberList) {
            System.out.println(member.inform());
        }
    }

    /*
    * 새로운 회원정보를ㄹ 추가하는 메서드
    * @param1 - 새로운 멤버
    * @pram2 - 새로운 멤버를 추가할 배열 ( memberList / removeList )
    * */
    boolean addMember(Member newMember,boolean addMember){
        Member[] members= addMember ? memberList :removeMembers ;
        //push
        Member[] temp = new Member[members.length + 1];
        for (int i = 0; i < members.length; i++) {
            temp[i] = members[i];
        }
        temp[temp.length-1] = newMember;

        if (addMember)  this.memberList = temp;
        else this.removeMembers = temp;

        return true;
    }

    /*
    * 이메일의 중복여부를 확인하는 메서드
    * @param1 email - 중복검사 대상
    * @return - 중복되었다면 true, 아니라면 false
    * */
    boolean isDuplicatedEmail(String email){
        for (Member member : memberList) {
            if (email.equals(member.email))
                return true;
        }
        return false;
    }

    /*
    * 이메일을 통해 특정회원 객체를 찾아서 반환하는 메서드
    *
    * @param1 email - 탐색할 멤버객체의 이메일
    * @return - 해당 이메일과 일치하는 회원의 모든정보 객체 이메일 일치하지않으면 null리턴
    * */
    Member findMemberByEmail(String email,boolean restore){
        Member[] targetList = restore ? removeMembers : memberList;
       int index = findMemberIndexByEmail(email,restore);
        return index >= 0 ?targetList[index] : null;
    }
    int findMemberIndexByEmail(String email,boolean restore) {
        Member[] targetList = restore ? removeMembers : memberList;
        for (int i = 0; i < targetList.length; i++) {
            Member member = targetList[i];
            if (email.equals(member.email)) {
                return i;
            }
        }
        return -1;
    }
    /*
    * 비밀번호를 수정하는 메서드 */
    void updatePassword(String newPassword, String email){
        Member member = findMemberByEmail(email,false);
        member.password = newPassword;
    }
    void updateName(String newName, String email){
        Member member = findMemberByEmail(email,false);
        member.memberName = newName;
    }
    void updateEmail(String newEmail, String email){
        Member member = findMemberByEmail(email,false);
        member.email = newEmail;
    }
    void updateAge(String newAge, String email){
        Member member = findMemberByEmail(email,false);
        member.age = Integer.parseInt(newAge);
    }

    /*
    * 회원 탈퇴를 처리하는 메서드
    * */
    void removeMember(Member member){

        deleteList(member,false);

        //삭제 배열에 추가
        addMember(member,false);
    }
    /*
     * 탈퇴된 회원을 복구하는 메서드
     * */
    void recoverMember(Member member){
        // 멤버 리스트에 추가
        addMember(member,true);

        deleteList(member,true);
    }

    //선택한 리스트에서 원하는 멤버 지우기
    private void deleteList(Member member,boolean restore) {
        Member[] members = restore ? removeMembers : memberList;
        //member가 있는 인덱스 찾기'
        int index = findMemberIndexByEmail(member.email,restore);

        //pop
        for (int i = index; i < members.length - 1; i++) {
            members[i] = members[i + 1];
        }
        //배열 복사
        Member[] temp = new Member[members.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = members[i];
        }

        if (restore) this.removeMembers = temp;
        else this.memberList = temp;


    }

    //지운 배열의 목록을 프린트
    void printRemoveMembers() {
        System.out.println("===================================");
        for (Member removeMember : removeMembers) {
            System.out.println(removeMember.inform());
        }
        System.out.println("===================================");
    }

    /*
     * 패스워드가 일치하는지 확인하는 메서드
     * */
    public boolean isMatchPassword(String newPw, String orginPw) {
        return newPw.equals(orginPw);
    }
}
