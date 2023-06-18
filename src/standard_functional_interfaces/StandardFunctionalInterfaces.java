package standard_functional_interfaces;

import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class StandardFunctionalInterfaces implements Consumer, Supplier, Function, Callable, Runnable {

    @Override
    public void run() {

    }

    @Override
    public Object call() throws Exception {
        return null;
    }

    @Override
    public void accept(Object o) {

    }

    @Override
    public Object apply(Object o) {
        return null;
    }

    @Override
    public Object get() {
        return null;
    }
}

//        1. **Consumer<T>**: принимает объект типа T, не возвращает результат.
//        Метод: void accept(T t)
//        2. **Supplier<T>**: не принимает параметры, возвращает объект типа T.
//        Метод: T get()
//        3. **Function<T, R>**: принимает объект типа T, возвращает объект типа R.
//        Метод: R apply(T t)
//        4. Predicate<T>: принимает объект типа T, возвращает boolean значение.
//        Метод: boolean test(T t)
//        5. UnaryOperator<T>: принимает и возвращает объект типа T.
//        Метод: T apply(T t)
//        6. BinaryOperator<T>: принимает два объекта типа T, возвращает объект типа T.
//        Метод: T apply(T t1, T t2)
//        7. BiFunction<T, U, R>: принимает два объекта типа T и U, возвращает объект типа R.
//        Метод: R apply(T t, U u)
