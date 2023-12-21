package day01;

public class ArraySearch {
    public static void main(String[] args) {
        String[] foods = {"족발","치킨","파스타","삽겹살"};
        String findTarget = "파스타";

        //선형 탐색
        //자바에서는 문자열 비교시 == 대신 equals라는 함수 써야함
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if(findTarget.equals(foods[i])){
                index = i;
                break;
            }

        }
        System.out.println("index = " + index);
    }
}
