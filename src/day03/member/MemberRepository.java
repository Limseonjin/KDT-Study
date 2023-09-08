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
     * 모든 회원 정보를 출력하는 메서드
     * */
    void showMembers(){
        System.out.printf("========현재 회원정보 ( 총 %d명 )==============\n",memberList.length);
        for (Member member : memberList) {
            System.out.println(member.inform());
        }
    }
    /*
    * 한명의 회원 정보를 출력하는 메서드 (패스워드 포함)
    * */
    void showMember(Member member){
        System.out.println("아이디 : " + member.memberId);
        System.out.println("비밀번호 : " + member.password);
        System.out.println("이름 : " + member.memberName);
        System.out.println("이메일 : " + member.email);
        System.out.println("나이 : " + member.age);
        System.out.println("회원가입일 : " + member.regDate);
    }

    /*
    * 새로운 회원정보를ㄹ 추가하는 메서드
    * @param1 - 새로운 멤버
    * @pram2 - 새로운 멤버를 추가할 배열 ( memberList / removeList )
    * */
    boolean addMember(Member newMember,Member[] members){
        //push
        Member[] temp = new Member[members.length + 1];
        for (int i = 0; i < members.length; i++) {
            temp[i] = members[i];
        }
        temp[temp.length-1] = newMember;

        if (members == memberList){
            this.memberList = temp;
        } else if (members == removeMembers){
            this.removeMembers = temp;
        }
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
    Member findMemberByEmail(String email,Member[] memberList){
        for (Member member : memberList) {
            if(email.equals(member.email)){
                return member;
            }
        }
        return null;
    }
    /*
    * 비밀번호를 수정하는 메서드 */
    void updatePassword(String newPassword, String email){
        Member member = findMemberByEmail(email,memberList);
        member.password = newPassword;
    }

    /*
    * 회원 탈퇴를 처리하는 메서드
    * */
    void removeMember(Member member){

        deleteList( member,memberList);

        //삭제 배열에 추가
        addMember(member,removeMembers);
    }
    /*
     * 탈퇴된 회원을 복구하는 메서드
     * */
    void recoverMember(Member member){
        // 멤버 리스트에 추가
        addMember(member,memberList);

        deleteList(member,removeMembers);
    }

    //선택한 리스트에서 원하는 멤버 지우기
    private void deleteList(Member member,Member[] members) {
        //member가 있는 인덱스 찾기
        int index = -1;
        for (int i = 0; i < members.length; i++) {
            if (member.email.equals(members[i].email)) {
                index = i;
                break;
            }
        }

        //배열 복사
        Member[] temp = new Member[members.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = members[i];
        }
        //지운 배열 밀기
        for (int i = index; i < temp.length; i++) {
            temp[i] = members[i + 1];
        }
        if (members == memberList){
            this.memberList = temp;
        } else if (members == removeMembers){
            this.removeMembers = temp;
        }
    }
}
