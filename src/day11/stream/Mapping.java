package day11.stream;

import java.lang.reflect.Type;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static day11.stream.Menu.menuList;

public class Mapping {
    //이름과 칼로리만 가진 클래스 설계
    private static class SimpleDish{
        private String name;
        private int calories;
        public SimpleDish(Dish dish){
            this.name = dish.getName();
            this.calories = dish.getCalories();
        }
        public SimpleDish(String name, int calories) {
            this.name = name;
            this.calories = calories;
        }

        @Override
        public String toString() {
            return "SimpleDish{" +
                    "name='" + name + '\'' +
                    ", calories=" + calories +
                    '}';
        }
    }
    private static class BigCaloriesDish{
        private String name;
        private Dish.Type type;

        public BigCaloriesDish(Dish dish) {
            this.name = dish.getName();
            this.type = dish.getType();
        }

        @Override
        public String toString() {
            return "BigCaloriesDish{" +
                    "name='" + name + '\'' +
                    ", type=" + type +
                    '}';
        }
    }
    public static void main(String[] args) {
        // stream의 map : 컬렉션(리스트, 셋, 맵..)에서 원하는 정보만 추출하여
        // 새로운 컬렉션으로 반환해줌
        List<String> nameList = menuList.stream()
                .map(dish -> dish.getName())
                .collect(Collectors.toList());
        System.out.println("nameList = " + nameList);

        // 요리목록에서 메뉴 이름과 칼로리를 추출 -> 새로운 클래스 생성

        menuList.stream()
                .map(dish -> new SimpleDish(dish))
                .collect(Collectors.toList())
                .forEach(d -> System.out.println(d));

        /*
        *  메뉴 목록에서 칼로리가 500칼로리 보다 큰 음식들을 필터링하고
        *  음식의 이름과 타입만 추출해서 출력
        * */
        menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
                .map(d -> new BigCaloriesDish(d))
                .collect(Collectors.toList())
                .forEach(d -> System.out.println(d));

    }
}
