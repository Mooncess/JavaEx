package splititerator_example;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SplititeratorExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three", "four", "five");

        Spliterator<String> spliterator = list.spliterator();

        Spliterator<String> firstHalf = spliterator.trySplit();
        Spliterator<String> secondHalf = spliterator;

        System.out.println(firstHalf.getExactSizeIfKnown()); // 2

        firstHalf.forEachRemaining(System.out::println); // one two

        System.out.println(firstHalf.getExactSizeIfKnown()); // 0
        System.out.println(secondHalf.getExactSizeIfKnown()); // 3
    }

}
