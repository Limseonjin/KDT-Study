package day11.lambda;

@FunctionalInterface
public interface GenericPredicate<T> {
    boolean test(T t);
}
