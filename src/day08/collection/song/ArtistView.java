package day08.collection.song;

import util.Utility;

import java.util.HashSet;
import java.util.Set;

import static util.Utility.*;

public class ArtistView {
    private static ArtistRepository ar;
    static {
        ar = new ArtistRepository();
    }

    public static void start() {
        selectMain();
    }
    private static void mainpage(){
        System.out.println("***** 음악 관리 프로그램 ******");
        System.out.printf("# 현재 등록된 가수: %d명\n",ar.sizeArtistList());
        System.out.println("# 1.노래 등록하기");
        System.out.println("# 2.노래 정보 검색");
        System.out.println("# 3.프로그램 종료");
        makeLine();
    }
    private static void selectMain(){
        while (true){
            mainpage();
            int menu = Integer.parseInt(input("선택: "));

            switch (menu){
                case 1:
                    addSong();
                    break;
                case 2:
                    serchSong();
                    break;
                case 3:
                    br();
                    String answer = input("# 정말로 종료합니까? [y/n] : ");
                    if (answer.toLowerCase().charAt(0) == 'y') {
                        System.out.println("# 프로그램을 종료합니다.");
                        System.exit(0);
                    } else {
                        continue;
                    }
                    break;
                default:
                    System.out.println("다시 입력 하세요");
            }
        }
    }

    private static void serchSong() {
        System.out.println("# 검색할 가수명을 입력하세요.");
        String singer = input("- 가수명: ");
        if (!ar.isArtist(singer)){
            System.out.println("해당 가수는 등록되지 않았습니다");
            return;
        }
        System.out.printf("# %s님의 노래목록",singer);
        makeLine();
        ar.serchArtist(singer);
        br();
    }

    private static void addSong() {
        System.out.println("# 노래 등록을 시작합니다.");
        String singer = input("- 가수명: ");
        String song = (input("- 노래명: "));
        ar.newArtist(singer, song);
        br();
    }
}
