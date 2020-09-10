package xyz.tiancaikai.gulimall.product;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        List<Integer> squaresList = numbers.stream()
                .filter( num -> num >= 3)
                .map(num -> num + 3)
                .sorted( (m1, m2) -> m2 - m1)
                .collect(Collectors.toList());

        System.out.println(squaresList.toString());
    }
}
