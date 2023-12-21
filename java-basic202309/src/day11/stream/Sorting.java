package day11.stream;

import java.util.Comparator;
import java.util.stream.Collectors;

import static day11.stream.Menu.menuList;
import static java.util.Comparator.comparing;

public class Sorting {
    public static void main(String[] args) {
        //음식 목록 중 칼로리가 낮은 순으로 정렬
        menuList.stream()
                .sorted(comparing(Dish::getCalories))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //오름차순
        menuList.stream()
                .sorted(comparing(Dish::getCalories).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        util.Utility.makeLine();

        //500칼로리보다 작은 요리 중에 top3 필터링
        menuList.stream()
                .filter(dish -> dish.getCalories() < 500)
                .sorted(comparing(Dish::getCalories).reversed())
                .limit(3)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
