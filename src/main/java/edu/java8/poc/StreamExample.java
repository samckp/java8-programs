package edu.java8.poc;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        System.out.println("Java 8- Stream example!");

        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();

        System.out.println(streamOfCollection.count());

        //forEach
        List<String> list = Arrays.asList("nodejs", "java", "python", "c++");
        list.forEach(System.out::println);

    }
}
