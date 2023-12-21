package day01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuize3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"영웅재중","최강창민","시아준수","믹키유천","유노윤호"};
        System.out.println("*우리반 학생들의 별명: "+Arrays.toString(arr));

        boolean flag = true;
        while(flag){
            System.out.println("- 삭제할 멤버의 이름을 입력하세요");
            String name = sc.nextLine();

            for (int i = 0; i <arr.length ; i++) {
                if (arr[i].equals(name)){
                    System.out.println(arr[i]+"의 별명을 삭제합니다.");

                    String[] arrCopy = Arrays.copyOf(arr,arr.length-1);
                    for (int j = i; j < arrCopy.length; j++) {
                        arrCopy[j] = arr[j+1];
                    }
                    arr = arrCopy;

                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println(name+"은(는) 없는 이름입니다.");
            else
                System.out.println("삭제완료!!");
        }
        System.out.println("*삭제 후 정보: "+Arrays.toString(arr));

    }
}
