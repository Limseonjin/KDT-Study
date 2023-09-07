package day02;

import java.util.Arrays;

public class MethodQuiz1 {
    static String[] foods = {"떡볶이","치킨","파스타"};
    static String[] userNames = {"홍길동","고길동"};

    public static void main(String[] args) {
        printFoods();
        push("라면");
        push("김치찌개");
        printFoods();

        // idx에 2가 리턴되어야 함.
        int idx = indexOf("파스타");
        System.out.println("idx = " + idx);
        // idx에 4가 리턴되어야 함.
        int idx2 = indexOf("김치찌개");
        System.out.println("idx2 = " + idx2);
        // idx에 -1이 리턴되어야 함.
        int idx3 = indexOf("짜장면");
        System.out.println("idx3 = " + idx3);

        remove("김치찌개"); // foods배열에서 김치찌개 제거
        remove("망고"); // 존재하지 않는 음식명입니다 출력.

        printFoods();


        boolean flag = include("파스타"); // 파스타 발견시 true 리턴
        boolean flag2 = include("양념치킨"); // 양념치킨 미발견시 false 리턴
        System.out.println("flag = " + flag);
        System.out.println("flag2 = " + flag2);

        insert(3, "파인애플"); // 3번 인덱스에 파인애플 삽입
        modify(2, "닭갈비");  // 2번 인덱스 데이터 닭갈비로 수정

        printFoods();
        clear();  // foods배열 모든 데이터 삭제
        printFoods();

    }

    private static void clear() {
        foods = new String[0];
    }

    // 원하는 사이즈 복사배열을 생성하는 함수
    static String[] makeNew(int size) {
        return new String[size];
    }

    //배열을 원하는 사이즈로 늘이거나 줄여서 카피해서 리턴하는 함수
    static String[] copy(int more) {
        int newSize = foods.length + more;
        String[] temp = makeNew(newSize);

        int loopCount = (more > 0) ? newSize - 1 : newSize;
        for (int i = 0; i < loopCount; i++) {
            temp[i] = foods[i];
        }
        return temp;
    }


    private static void modify(int i, String food) {
        foods[i] = food;
    }

    private static void insert(int i, String food) {
        String[] foodsCopy = copy(1);

        for (int j= foodsCopy.length-1; j < i; j--) {
            foodsCopy[j] = foodsCopy[j-1];
        }
        foodsCopy[i] = food;
        foods = foodsCopy;
    }

    private static boolean include(String food) {
        return indexOf(food) != -1;
    }
    static void pop() {
        foods = copy(-1);
    }

    private static void remove(String food) {
        int index = indexOf(food);
        if (!include(food)){
            System.out.println("존재하지 않는 음식명입니다.");
            return;
        }

        for (int j = index; j < foods.length-1; j++) {
            foods[j] = foods[j+1];
        }
        pop();

    }

    private static int indexOf(String food) {
        for (int i = 0; i < foods.length; i++) {
            if(foods[i].equals(food)){
                return i;
            }
        }
        return -1;
    }

    private static void push(String food) {
        foods = copy(+1);
        foods[foods.length-1] = food;
    }

    private static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }
}
