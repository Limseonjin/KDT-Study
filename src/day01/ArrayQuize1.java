package day01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuize1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("# 먹고싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요");

        String[] foods=new String[0];
        while(true){
            String food = sc.nextLine();
            if(food.equals("그만")) break;


            String[] foodCopy = Arrays.copyOf(foods,foods.length+1);
            foodCopy[foodCopy.length-1] = food;

            foods = foodCopy;
        }
        System.out.println("Arrays.toString(foods) = " + Arrays.toString(foods));


    }
}
