package day01;

import java.util.Scanner;

public class StdIO {
    public static void main(String[] args) {
        
        //자바에서 입력을 처리 하는 객체 1번 선언하면 됨 
        Scanner sc = new Scanner(System.in);
        
        //문자 입력
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.print("나이을 입력하세요: ");
        String inputAge = sc.nextLine();

        int age = Integer.parseInt(inputAge);
        int birthYear = 2023 -age +1;

        System.out.printf("이름: %s, 출생년도 %s세\n",name,birthYear);

        sc.close();

    }
}
