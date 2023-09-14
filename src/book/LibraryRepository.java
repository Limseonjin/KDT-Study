package book;

import day03.member.Gender;

import java.util.Arrays;

public class LibraryRepository {
    //데이터 관리 클래스

    // 회원 1명
    private static BookUser bookUser;

    // 도서들의 정보
    private static Book[] bookList;

    static {
        bookList = new Book[] {
                new CookBook("기적의 집밥책", "김해진", "청림라이프", true),
                new CartoonBook("떨어지면 끝장맨", "스에노부 케이코", "대원씨아이", 18),
                new CartoonBook("원펀맨", "One", "대원씨아이", 15),
                new CookBook("삐뽀삐뽀 119 이유식", "하정훈", "유니책방", false),
                new CookBook("오늘은 아무래도 덮밥", "이마이 료", "참돌", true),
                new CartoonBook("이세계로 전이했으니 치트를 살려 마법검사가 되기로 했다", "Shinkoshoto", "대원씨아이", 12)
        };
    }

    //회원정보를 저장
    void inputUser(String name, int age, Gender gender,int coupon){
        bookUser = new BookUser();
        bookUser.setName(name);
        bookUser.setAge(age);
        bookUser.setGender(gender);
        bookUser.setCouponCount(coupon);
    }
    //회원 정보를 출력
    void showUser(){
        System.out.println("******** 회원님 정보 ***********");
        System.out.println("# 회원명: "+bookUser.getName());
        System.out.println("# 나이: "+bookUser.getAge());
        System.out.println("# 성별: "+bookUser.getGenderToString());
        System.out.println("# 쿠폰개수: "+bookUser.getCouponCount());
        System.out.println("");
    }


    //모든 도서책 출력
    void showBook(){
        for (Book book : bookList) {
            if (book instanceof CookBook){
                CookBook cookBook = (CookBook) book;
                System.out.println(cookBook.info());
            } else if (book instanceof CartoonBook) {
                CartoonBook cartoonBook = (CartoonBook)book;
                System.out.println(cartoonBook.info());
            }
        }
    }
    void showBook(Book book){
        if (book instanceof CookBook){
            CookBook cookBook = (CookBook) book;
            System.out.println(cookBook.info());
        } else if (book instanceof CartoonBook) {
            CartoonBook cartoonBook = (CartoonBook)book;
            System.out.println(cartoonBook.info());
        }
    }

    //책 제목으로 검색하기
    void searchTitle(String search){
        for (Book book : bookList) {
            if (!book.getTitle().contains(search))
                continue;
            showBook(book);
        }
    } //책 저자로 검색하기
    void searchAuthor(String search){
        for (Book book : bookList) {
            if (!book.getAuthor().contains(search))
                continue;
            showBook(book);
        }
    }

    //대여 가능한 도서정보 출력
    void showPublisherBook(){
        int i = 1;
        for (Book book : bookList) {
            System.out.printf("%d. ",i);
            if (book instanceof CookBook){
                CookBook cookBook = (CookBook) book;
                System.out.println(cookBook.info());
            } else if (book instanceof CartoonBook) {
                CartoonBook cartoonBook = (CartoonBook)book;
                System.out.println(cartoonBook.info());
            }
            i++;
        }
    }

    RentStatus isrentBook(int i){
        Book book = bookList[i-1];

        if (book instanceof CookBook){
            CookBook cookBook = (CookBook) book;
            if (cookBook.isCoupon()){
                bookUser.setCouponCount(bookUser.getCouponCount()+1);
                return RentStatus.RENT_SUCCESS_WITH_COUPON;
            }
        } else if (book instanceof CartoonBook) {
            CartoonBook cartoonBook = (CartoonBook)book;
            if (cartoonBook.getAccessAge() > bookUser.getAge()){
                return RentStatus.RENT_FAIL;
            }
        }
        return RentStatus.RENT_SUCCESS;
    }


}
