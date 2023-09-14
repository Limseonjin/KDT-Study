package book;

import day02.Genre;
import day03.member.Gender;
import util.Utility.*;

import static util.Utility.input;

public class LibraryView {
    private static LibraryRepository rp = new LibraryRepository();

    public static void start(){
        inputUserInfo();
        MainProcess();
    }

    //메인 메뉴 출력
    static void MainView(){
        System.out.println("============= 도서 메뉴 ===========");
        System.out.println("# 1. 마이페이지");
        System.out.println("# 2. 도서 전체 조회");
        System.out.println("# 3. 도서 제목으로 검색");
        System.out.println("# 4. 도서 대여하기");
        System.out.println("# 5. 도서 저자이름으로 검색");
        System.out.println("# 9. 프로그램 종료하기");
    }

    //메인 메뉴 선택
    static void MainProcess(){
        while (true){
            MainView();
            String menu = input("- 메뉴 번호:");
            System.out.println("");
            switch (menu){
                case "1":
                    rp.showUser();
                    break;
                case "2":
                    showAllBook();
                    break;
                case "3":
                    searchTitle();
                    break;
                case "4":
                    rentBook();
                    break;
                case "5":
                    searchAuthor();
                    break;
                case "9":
                    return;
            }
        }
    }

    private static void searchAuthor() {
        String search = input("# 검색어: ");
        System.out.printf("======== [%s] 검색 결과 ========\n",search);
        rp.searchAuthor(search);
    }

    //책 대여하기
    private static void rentBook() {
        System.out.println("============ 대여 가능한 도서 정보 ==============");
        rp.showPublisherBook();
        int num = Integer.parseInt(input("- 대여할 도서 번호 입력: "));
        RentStatus rs = rp.rentBook(num);

        if (rs == RentStatus.RENT_SUCCESS)
            System.out.println("# 도서가 성공적으로 대여되었습니다.");
        else if (rs == RentStatus.RENT_SUCCESS_WITH_COUPON)
            System.out.println("# 성공적으로 요리책이 쿠폰발급과 함께 대여되었습니다.");
        else{
            System.out.println("# 도서 대여에 실패했습니다.");
        }
        System.out.println("");
    }

    //책 이름으로 검색
    private static void searchTitle() {
        String search = input("# 검색어: ");
        System.out.printf("======== [%s] 검색 결과 ========\n",search);
        rp.searchTitle(search);
    }
    private static void showAllBook() {
        System.out.println("========= 모든 도서 정보 ==========");
        rp.showBook();
    }

    //회원정보 입력 메서드
    static void inputUserInfo(){
        System.out.println("# 회원 정보를 입력해주세요.");
        String name = input("# 이름:");
        int age = Integer.parseInt(input("# 나이: "));
        Gender gender = checkChangeGender();
        System.out.println("");

        rp.inputUser(name,age,gender,0);
    }

    //성별 형변환 메서드
    static Gender checkChangeGender(){
        while (true){
            String gen = input("# 성별(M/F): ");
            if (gen.equals("M"))
                return Gender.MALE;
            else if (gen.equals("F")) {
                return Gender.FEMALE;
            }
            else {
                System.out.println("M/F 둘 중 하나로 입력하세요");
            }
        }
    }
}
