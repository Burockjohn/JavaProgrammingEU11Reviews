package week_16.functional_interfaces;

@FunctionalInterface
public interface MyFunctionalInterface<T, U, V, R> {

    R test(T t, U u, V v);

}
