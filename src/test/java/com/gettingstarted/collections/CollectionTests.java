package com.gettingstarted.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionTests {

    @Test
    public void loopTest(){

        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);

        for (int i = 0; i < numberList.size(); i++) {


            System.out.println("First item in the list is " + numberList.get(i));

        }
        System.out.println("************************************");
        numberList.stream().forEach(number -> System.out.println("First item in the list is " + number));
        System.out.println("************************************");
        List<Integer> updated = numberList.stream().map(x -> x + 1).collect(Collectors.toList());
        updated.stream().forEach(number -> System.out.println("First item in the list is " + number));

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);


    }
}
