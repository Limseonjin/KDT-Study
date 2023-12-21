package day08.collection.map;

import day05.poly.car.Mustang;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        //key와 value의 타입을 각각 정해줄 수 있음
        Map<String, Object> map = new HashMap<>();

        //put(K,V) : 데이터 추가
        map.put("지갑잔액", 5000);
        map.put("좋아하는 자동차", new Mustang());
        map.put("저녁메뉴","계란말이");

        System.out.println(map.size());

        //get(key) : 데이터 가져오기
        int money = (int) map.get("지갑잔액");
        System.out.println(money);

        //중복된 키를 저장하면 값이 변경
        map.put("저녁메뉴", "김치찌개");
        System.out.println("map = " + map);

        Set<String> ketSet = map.keySet();
        System.out.println(ketSet);

        for (String s : ketSet) {
            System.out.printf("%s : %s\n",s,map.get(s));

        }

    }
}
