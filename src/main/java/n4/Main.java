package n4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Task:
 * 1) Implement interface BiggestNumberFinder to provide functionality of finding the biggest number from array
 * 2) Write unit tests for this class with JUnit
 */

public class Main implements BiggestNumberFinder {

    @Override
    public int findTheBiggestNumber(int[] numbers) {

        List<Integer> numbersList = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        return numbersList.stream()
                .collect(Collectors.summarizingInt(Integer::intValue))
                .getMax();
    }
}
