package day11.lambda;

import java.util.ArrayList;
import java.util.List;

public class MappingApple {
    //사과의 색상만 추출
    public static List<Color> mappingAppleByColor(List<Apple> apples){
        List<Color> colorList = new ArrayList<>();
        for (Apple a : apples) {
            colorList.add(a.getColor());
        }
        return colorList;
    }

    public static <X,Y> List<Y> map(List<X> apples,GenericFunction<X,Y> mapper){
        List<Y> mappedList = new ArrayList<>();
        for (X x : apples) {
            Y y = mapper.apply(x); // Y를 X에서 추출 <- 이것을 파라미터화
            mappedList.add(y);
        }
        return mappedList;
    }
}
