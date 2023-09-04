package day01;

public class VarScope {
    public static void main(String[] args) {
        // 자바는 블록단위 스코프를 가진다.
        int number = 1010;
        int number2 = 2020;

        //자바에서는 변수가 생성된 블록을 나가면 자동삭제

        if (true){
            int number3 = 3030;
            System.out.println("number3 = " + number3);
        }
        int number3 = 4040;

    }//end main

}
