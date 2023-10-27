package day11.stream;

import java.util.Comparator;

import static day11.stream.Menu.menuList;
import static java.util.Comparator.comparing;

public class Finding {
    public static void main(String[] args) {
        //음식 메뉴 중 채식주의자가 먹을 수 있는 요리가 있눈강?
        boolean flag1 = menuList.stream()
                .anyMatch(dish -> dish.isVegeterian());
        System.out.println("flag1 = " + flag1);

        //음식메뉴중 칼로리가 50 미만인 음식이 있는강?
        boolean flag2 = menuList.stream()
                .anyMatch(dish -> dish.getCalories() < 50);
        System.out.println("flag2 = " + flag2);

        // 음식메뉴중 모든 요리가 1000칼로리 미만인가?
        boolean flag3 = menuList.stream()
                .allMatch(dish -> dish.getCalories() < 1000);
        System.out.println("flag3 = " + flag3);

        // 음식메뉴중 모든 요리가 1000칼로리 미만이 아닌가??
        boolean flag4 = menuList.stream()
                .noneMatch(dish -> dish.getCalories() < 1000);
        System.out.println("flag4 = " + flag4);

        //음식 중 칼로리가 가장 낮은 음식을 조회해주셈
        Dish dish = menuList.stream()
                .min(comparing(Dish::getCalories))
                .get();
        System.out.println("dish = " + dish);
    }
}
