package stream_api;

import java.util.Arrays;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)// Отфильтровываем только четные числа
                .mapToInt(Integer::intValue)// Преобразуем Integer в int
                .sum();// Складываем все элементы
        System.out.println(sum);// Выводим результат: 6
    }
}
