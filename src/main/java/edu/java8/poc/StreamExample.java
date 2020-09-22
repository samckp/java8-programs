package edu.java8.poc;

import java.util.ArrayList;
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

        System.out.println("Create Stream example!");
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(p -> System.out.println(p));

        System.out.println("Create Stream array example!");
        Stream<Integer> streamArray = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        streamArray.forEach(p -> System.out.println(p));


        System.out.println("Iterate Stream List example!");
        List<Integer> lists = new ArrayList<>();

        for(int i = 1; i< 10; i++){
            lists.add(i);
        }

        Stream<Integer> streamList = lists.stream();
        streamList.forEach(p -> System.out.println(p));

        //------------------------------------------

        List<Integer> listInt = new ArrayList<Integer>();

        for(int i = 1; i< 10; i++){
            listInt.add(i);
        }

        Stream<Integer> streamInt = listInt.stream();
        Integer[] evenNumbersArr = streamInt.filter(i -> i%2 == 0).toArray(Integer[]::new);
        System.out.print(evenNumbersArr.length);

        System.out.print("-----------------Parallem Stream---------------------");
        parallelStream();
    }

    public static void parallelStream(){

        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        //Here creating a parallel stream
        Stream<Integer> stream = list.parallelStream();

        Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
        System.out.print(evenNumbersArr);
    }
}
