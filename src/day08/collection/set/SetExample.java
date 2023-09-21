package day08.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        //빠른 저장속도, 중복제거, 순서가 없음
        //인덱스,키 없음! 개별탐색에는 불리
        Set<String> foodSet = new HashSet<>();

        //add(E e) : 데이터 추가
        boolean f1 = foodSet.add("김말이");
        foodSet.add("떡볶이");
        foodSet.add("단무지");
        boolean f2 = foodSet.add("김말이");
        foodSet.add("어묵");

        System.out.println("foodSet = " + foodSet);
        System.out.println(foodSet.size());

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        for (String s : foodSet) {
            System.out.print(s);
        }

        //remove(object)
        foodSet.remove("단무지");
        System.out.println(foodSet);

        //데이터 중복을 빠르게 제거할때
        ArrayList<Integer> integers = new ArrayList<>(
                List.of(1,1,13,3,2,2,4,4,5)
        );
        System.out.println(integers);
        //set으로 변환
        Set<Integer> numberSet = new HashSet<>(integers);
        System.out.println(numberSet);
        //List로 변환
        integers = new ArrayList<>(numberSet);

    }
}
