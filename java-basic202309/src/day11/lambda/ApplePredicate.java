package day11.lambda;

@FunctionalInterface
public interface ApplePredicate {
    //사과를 전달 받으면 조건에 맞는 검사를 수행하는 메서드
    boolean test(Apple apple);
}
