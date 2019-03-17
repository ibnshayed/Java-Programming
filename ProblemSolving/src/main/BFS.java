package main;

import java.security.SecureRandom;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static javafx.scene.input.KeyCode.T;

public class BFS {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        random.ints(10, 1, 8)
                .forEach(System.out::println);
                //.forEach(x -> System.out.print(x + " "));

        String numbers = random.ints(10,1,5)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.print(numbers);
    }

}
