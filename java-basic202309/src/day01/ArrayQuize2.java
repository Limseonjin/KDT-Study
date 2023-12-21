package day01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuize2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"영웅재중","최강창민","시아준수","믹키유천","유노윤호"};
        System.out.println("*변경전 정보: "+Arrays.toString(arr));

        boolean flag = true;
        while(flag){
            System.out.println("- 수정할 멤버의 이름을 입력하세요");
            String name = sc.nextLine();

            for (int i = 0; i <arr.length ; i++) {
                if (arr[i].equals(name)){
                    System.out.println(arr[i]+"의 별명을 변경합니다.");

                    String newName = sc.nextLine();
                    arr[i] = newName;

                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println(name+"은(는) 없는 이름입니다.");
            else
                System.out.println("변경완료!!");
        }
        System.out.println("*변경 후 정보: "+Arrays.toString(arr));

    }
}
