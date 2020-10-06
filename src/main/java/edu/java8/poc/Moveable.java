package edu.java8.poc;

public interface Moveable {

        default void move(){
            System.out.println("I am moving");
        }

        default void walk(){
            System.out.println("I am walking");
        }
}
