package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;
import static java.util.stream.Stream.*;

public class StreamAPIWithStaticImport {
    public static void main(String[] args) {
        // Без статического импорта
        List<Integer> numbers = Stream.of(1, 2, 3, 4, 5).collect(toList());
        System.out.println(numbers);

        // С статическим импортом
        List<Integer> numbers2 = of(1, 2, 3, 4, 5).collect(toList());
        System.out.println(numbers2);

        // --------------------------------
        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)// Отфильтровываем только четные числа
                .mapToInt(Integer::intValue)// Преобразуем Integer в int
                .sum();// Складываем все элементы
        System.out.println(sum);// Выводим результат: 6
        // --------------------------------

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

        // пример фильтрации и сортировки элементов
        List<String> filteredAndSortedNames = names.stream()
                // нетерминальные операции
                .filter(name -> name.length() < 5) // лямбда-выражение
                .sorted()
                // терминальная операция
                .collect(toList());

        System.out.println(filteredAndSortedNames);// [Bob, Dave]

        filteredAndSortedNames.stream().forEach(n -> System.out.println(n));
    }
}
