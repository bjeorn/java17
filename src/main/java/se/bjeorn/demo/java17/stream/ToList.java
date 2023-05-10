package se.bjeorn.demo.java17.stream;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ToList {

    public static void main(final String[] args) {
        final var list = List.of("a", "b", "c", "");

        final var list1 = list.stream()
            .filter(Predicate.not(String::isBlank))
            .collect(Collectors.toList()); // mutable, java.util.ArrayList

        list1.add("d");
        list1.sort(Comparator.reverseOrder());

        System.out.println(list1);
        System.out.println(list1.getClass());

        System.out.println("\n");


//        final var list2 = list.stream()
//            .filter(Predicate.not(String::isBlank))
//            .toList(); // immutable, java.util.ImmutableCollections.ListN
//
////        list2.add("d");
////        list2.sort(Comparator.reverseOrder());
//
//        System.out.println(list2);
//        System.out.println(list2.getClass());
    }
}
