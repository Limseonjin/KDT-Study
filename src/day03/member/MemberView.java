package day03.member;

import java.time.LocalDate;
import java.util.Scanner;

//역할 : 회원관리 앱의 입출력을 담당
public class MemberView {
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
        System.out.println("* 1. 회원 정보 등록하기");
        System.out.println("* 2. 개별회원 정보 조회하기");
        System.out.println("* 3. 전체회원 정보 조회하기");
        System.out.println("* 4. 회원 정보 수정하기");
        System.out.println("* 5. 회원 정보 삭제하기");
        System.out.println("* 6. 프로그램 끝내기");
        System.out.println("=============================");
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
                    signUp();
                    break;
                case "2":
                    break;
                case "3":
                    mr.showMembers();
                    stop();
                    break;
                case "4":
                    break;
                case "5":
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
                default:
                    System.out.println("\n# 메뉴 번호를 다시 입력하세요");
            }
        }
    }


    //회원가입 입출력을 처리하는 메서드
    private void signUp() {
        String email = input("# 이메일: ");
        String name = input("# 이름: ");
        String pw = input("# 패스워드: ");
        String gender = input("# 성별: ");
        String age = input("# 나이: ");

        //실제 배열 저장 명령
        //랜덤 아이디 생성 ( 1~9999999)
        int randomId = (int)(Math.random()*999999)+1;

        Member newMember = new Member(randomId,email,pw,name,Gender.valueOf(gender),Integer.parseInt(age));
        mr.addMember(newMember);

        System.out.println("# 회원가입 성공!!");
        stop();

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
