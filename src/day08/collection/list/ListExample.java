package day08.collection.list;

import util.Utility;

import java.util.*;

import static util.Utility.makeLine;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("dd");
        list.add("34");
        list.add("뇽뇽");

        System.out.println(list);

        //add(int i, E e) : 중간 삽입
        list.add(2,"구마내");
        System.out.println(list);

        //size() : length 사용X
        System.out.println(list.size());


        //indexOf(E e): 0번부터 검색
        int index = list.indexOf("34");
        System.out.println("index = " + index);

        //contains(E e) : 해당 데이터 저장유무 T/F
        System.out.println(list.contains("2"));

        //remove(index), remove(object)
        list.remove(0);
        list.remove("뇽뇽");
        System.out.println(list);

        //set(index, newElement) : 수정
        list.set(0,"끼잉낑낑ㄱ");
        System.out.println(list);

        //get(index) : 리스트에 저장된 데이터를 참조
        String s = list.get(1);
        System.out.println(list);

        makeLine();
        //반복문 처리
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (String string : list) {
            System.out.println("string = " + string);
        }

        //clear(): 전체삭제
        //isEmpty(): 리스트가 비어있는지 확인
        makeLine();
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());
    }
}
