package day11.inner;

//이 인터페이스는 람다를 사용 할 수있나?
// 람다 사용조건 : 추상메서드가 단 하나여야 가능
@FunctionalInterface
public interface Calculator {

    //계산에 관련된 기능을 명세
    //두 개의 정수를 상호아에 맞게 연산할 수 있다.
    int operate(int n1, int n2);
    default void abc(){};
}
