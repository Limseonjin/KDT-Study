package day07.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowException {
    public int inputNumber() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        try {
            n = sc.nextInt();
        } catch (Exception e) {
            System.out.println("정수만 입력하세요.");
        }
        return n;
    }

    public int convert(String s) {
        int n = Integer.parseInt(s);
        return n;
    }
    public int inputAndConvertNumber(){
        int n = 0;
        int m = 0;
        try {
            n = inputNumber();
            m = convert("100");
        } catch (InputMismatchException e) {
            System.out.println("정수로만 입력하세요");
        }catch (NumberFormatException e){
            System.out.println("숫자형태의 문자를 전달하세요");
        }

        return n+m;
    }

}
