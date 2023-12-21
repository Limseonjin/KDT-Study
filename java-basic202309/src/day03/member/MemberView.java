package day03.member;

import java.util.Scanner;

//역할 : 회원관리 앱의 입출력을 담당
public class MemberView {

    //상수 만들기
    public static final int MAX_REGISTER = 10;
    Scanner sc;
    MemberRepository mr;

    public MemberView() {
        this.sc = new Scanner(System.in);
        this.mr = new MemberRepository();
        viewProcess();
    }

    /**
     * 초기 메인 화면을 출력
     */
    void mainView() {
        System.out.println("\n##### 회원 관리 시스템 #####");
        if (mr.showMemberListSize(mr.memberList) < MAX_REGISTER){
            System.out.println("* 1. 회원 정보 등록하기");
        }else{
            System.out.println("# 정원 초과로 등록이 불가능합니다");
        }
        System.out.println("* 2. 개별회원 정보 조회하기");
        System.out.println("* 3. 전체회원 정보 조회하기");
        System.out.println("* 4. 회원 정보 수정하기");
        System.out.println("* 5. 회원 정보 삭제하기");
        System.out.println("* 6. 프로그램 끝내기");
        if (mr.showMemberListSize(mr.removeMembers) > 0){
            System.out.println("* 7. 회원 복구하기");
        }
        System.out.println("=============================");
    }
    void changeInfoView(){
        System.out.println("# 수정할 정보를 선택하세요");
        System.out.println("* 1. 패스워드");
        System.out.println("* 2. 이름");
        System.out.println("* 3. 이메일");
        System.out.println("* 4. 나이");
        System.out.println("* 5. 모든 정보 한번에 수정");
        System.out.println("* 6. 메인 메뉴로 돌아가기");
    }

    /**
     * 프로그램 화면 흐름을 제어하는 기능
     */
    void viewProcess() {
        while (true) {
            mainView();
            String menuNum = input(">> ");

            switch (menuNum) {
                case "1":
                    if (!(mr.showMemberListSize(mr.memberList) < MAX_REGISTER)){
                        System.out.println("\n# 메뉴 번호를 다시 입력하세요");
                        break;
                    }
                    signUp();
                    break;
                case "2":
                    showOneMember();
                    break;
                case "3":
                    mr.showMembers();
                    stop();
                    break;
                case "4":
                    changeinfo();
                    break;
                case "5":
                    deleteMember();
                    break;
                case "6":
                    String answer = input("# 정말로 종료합니까? [y/n] : ");
                    if (answer.toLowerCase().charAt(0) == 'y') {
                        System.out.println("# 프로그램을 종료합니다.");
                        System.exit(0);
                    } else {
                        continue;
                    }
                    break;
                case "7":
                    if (mr.removeMembers.length < 1){
                        System.out.println("\n# 메뉴 번호를 다시 입력하세요");
                        break;
                    }
                    restoreMember();
                    break;
                default:
                    System.out.println("\n# 메뉴 번호를 다시 입력하세요");
            }
        }
    }

    private void changeinfo() {
        while (true){

            changeInfoView();

            String menuNum = input(">> ");

            switch (menuNum) {
                case "1":
                    changePassword();
                    break;
                case "2":
                    changeName();
                    break;
                case "3":
                    changeEmail();
                    break;
                case "4":
                    changeAge();
                    break;
                case "5":
                    changeAll();
                    break;
                case "6":
                    String answer = input("# 정말로 종료합니까? [y/n] : ");
                    if (answer.toLowerCase().charAt(0) == 'y') {
                        System.out.println("# 메인메뉴로 돌아갑니다.");
                        stop();
                    }else {
                        continue;
                    }
                    return;
                default:
                    System.out.println("\n# 메뉴 번호를 다시 입력하세요");
            }
        }

    }






    private void showOneMember() {
        //email 입력받음
        String email = input("# 조회 대상의 이메일: ");
        //email 탐색
        Member member = mr.findMemberByEmail(email, false);

        if (member != null){
            member.showDetailInfo();
        }else {
            System.out.printf("\n# 조회결과가 없습니다.");
        }
        stop();
    }

    //패스워드를 수정하는 메소드
    private void changePassword() {
        //email 입력받음
        String email = input("# 수정 대상의 이메일: ");

        //수정 대상 탐색
        Member member = mr.findMemberByEmail(email,false);

        //회원이 탐색됨
        if (member != null){
            System.out.printf("# %s님의 비밀번호를 변경합니다.\n",member.memberName);
            String newPw = input("# 새로운 비밀번호 : ");

            //새 비번이 기존비번과 같은경우 pass
            if(member.password.equals(newPw)){
                System.out.println("# 기존 비밀번호와 동일합니다. 변경을 취소합니다.");
                stop();
                return;
            }
            mr.updatePassword(newPw, email);
            System.out.println("# 비밀번호 변경이 완료되었습니다.");

        }else {
            System.out.printf("\n# 조회결과가 없습니다.");
        }
        stop();
    }
    private void changeName() {
        //email 입력받음
        String email = input("# 수정 대상의 이메일: ");

        //수정 대상 탐색
        Member member = mr.findMemberByEmail(email,false);

        //회원이 탐색됨
        if (member != null){
            System.out.printf("# %s님의 이름를 변경합니다.\n",member.memberName);
            String newName = input("# 새로운 이름 : ");

            //새로운 이름이 기존이름과 같은경우 pass
            if(member.memberName.equals(newName)){
                System.out.println("# 기존 이름과 동일합니다. 변경을 취소합니다.");
                stop();
                return;
            }
            mr.updateName(newName, email);
            System.out.println("# 이름 변경이 완료되었습니다.");

        }else {
            System.out.printf("\n# 조회결과가 없습니다.");
        }
        stop();
    }

    private void changeAge() {
        //email 입력받음
        String email = input("# 수정 대상의 이메일: ");

        //수정 대상 탐색
        Member member = mr.findMemberByEmail(email,false);

        //회원이 탐색됨
        if (member != null){
            System.out.printf("# %s님의 나이를 변경합니다.\n",member.memberName);
            String newAge = input("# 새로운 나이 : ");

            //새 비번이 기존비번과 같은경우 pass
            if(member.password.equals(newAge)){
                System.out.println("# 기존 나이와 동일합니다. 변경을 취소합니다.");
                stop();
                return;
            }
            mr.updatePassword(newAge, email);
            System.out.println("# 나이 변경이 완료되었습니다.");

        }else {
            System.out.printf("\n# 조회결과가 없습니다.");
        }
        stop();
    }

    private void changeEmail() {
        //email 입력받음
        String email = input("# 수정 대상의 이메일: ");

        //수정 대상 탐색
        Member member = mr.findMemberByEmail(email,false);

        //회원이 탐색됨
        if (member != null){
            System.out.printf("# %s님의 이메일을 변경합니다.\n",member.memberName);
            String newEmail = input("# 새로운 이메일 : ");

            //새 비번이 기존비번과 같은경우 pass
            if(member.password.equals(newEmail)){
                System.out.println("# 기존 이메일과 동일합니다. 변경을 취소합니다.");
                stop();
                return;
            }
            mr.updateEmail(newEmail, email);
            System.out.println("# 이메일 변경이 완료되었습니다.");

        }else {
            System.out.printf("\n# 조회결과가 없습니다.");
        }
        stop();
    }
    private void changeAll() {
        //email 입력받음
        String email = input("# 수정 대상의 이메일: ");

        //수정 대상 탐색
        Member member = mr.findMemberByEmail(email,false);

        //회원이 탐색됨
        if (member != null){
            System.out.printf("# %s님의 회원정보를 변경합니다.\n",member.memberName);
            String newPw = input("# 새로운 비밀번호 : ");
            String newName = input("# 새로운 이름 : ");
            String newEmail = input("# 새로운 이메일 : ");
            String newAge = input("# 새로운 나이 : ");

            mr.updatePassword(newPw, email);
            mr.updateName(newName,email);
            mr.updateAge(newAge,email);
            mr.updateEmail(newEmail,email);

            System.out.println("# 회원정보 변경이 완료되었습니다.");

        }else {
            System.out.printf("\n# 조회결과가 없습니다.");
        }
        stop();
    }
    /*
     * 패스워드를 3번 이상 잘못 입력시 true를 반환하는 메서드
     * */
    private boolean isPasswordinput(Member member) {
        for (int i = 0; i < 3; i++) {
            String newPw = input("# 비밀번호 : ");
            if (mr.isMatchPassword(newPw,member.password)) break;
            if (i == 2){
                System.out.println("# 비밀번호를 3회이상 틀렸습니다. 해당 시스템을 종료합니다.");
                stop();
                return true;
            }
            System.out.println("# 비밀번호를 틀렸습니다. 다시 입력하세요.");
        }
        return false;
    }
    //회원 탈퇴를 하는 메서드
    private void deleteMember() {
        //email 입력받음
        String email = input("# 삭제 대상의 이메일: ");
        //email 탐색
        Member member = mr.findMemberByEmail(email, false);

        if (member != null){
            if (isPasswordinput(member)) return;

            mr.removeMember(member);
            System.out.println("# 회원 탈퇴가 완료되었습니다.");
        }else {
            System.out.printf("\n# 해당 회원이 없습니다.");
        }
        stop();
    }

    private void restoreMember() {
        //email 입력받음
        String email = input("# 복구할 대상의 이메일: ");
        //email 탐색
        Member member = mr.findMemberByEmail(email,true);

        if (member != null){
            if (isPasswordinput(member)) return;

            //비번이 다르면 pass
            if (mr.memberList.length >= 10){
                System.out.println("# 회원자가 10명이 넘어 복구를 할 수 없습니다.");
                stop();
                return;
            }
            mr.recoverMember(member);
            System.out.println("# 회원 복구가 완료되었습니다.");
        }else {
            System.out.printf("\n# 해당 회원이 없습니다.");
        }
        stop();
    }


    //회원가입 입출력을 처리하는 메서드
    private void signUp() {
        if (mr.memberList.length >= 10){
            System.out.println("가입된 회원이 10명 이상입니다. 회원가입이 불가능합니다.");
            stop();
            return;
        }
        String email = checkDuplicateEmailInput();
        String name = input("# 이름: ");
        String pw = input("# 패스워드: ");
        Gender gender = checkCorrectGenderInput();
        String age = input("# 나이: ");

        //실제 배열 저장 명령
        //랜덤 아이디 생성 ( 1~9999999)
        int randomId = (int)(Math.random()*999999)+1;

        Member newMember = new Member(randomId,email,pw,name,gender,Integer.parseInt(age));
        mr.addMember(newMember, true);

        System.out.println("# 회원가입 성공!!");
        stop();

    }

    //성별 M/F입력한지 확인
    private Gender checkCorrectGenderInput() {
        while(true){
            String inputGender = input("# 성별 [M/F]: ");
            switch (inputGender){
                case "M":
                    return Gender.MALE;
                case "F":
                    return Gender.FEMALE;
                default:
                    System.out.println("#성별을 M 또는 F로 입력하세요");
            }
        }
    }

    //email 중복 확인
    private String checkDuplicateEmailInput() {
        while(true){
            String email = input("# 이메일: ");
            if (!mr.isDuplicatedEmail(email))
                return email;
            else
                System.out.println("# 이메일이 중복되었습니다.");
        }

    }

    // 입력처리를 간편하게 해주는 메서드
    public String input(String massage){
        System.out.print(massage);
        return sc.nextLine();
    }


    // 엔터를 누르기전까지 멈추는 기능
    void stop() {
        System.out.println("\n======= 엔터를 눌러서 계속…======");
        sc.nextLine();
    }


}
