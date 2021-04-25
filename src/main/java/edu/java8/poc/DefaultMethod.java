package edu.java8.poc;

public class DefaultMethod implements Moveable{

    @Override
    public void walk() {
        System.out.println("Running from Class !!");
    }

    public static void main(String[] args) {

        DefaultMethod defaultMethod = new DefaultMethod();
        defaultMethod.move();
        defaultMethod.walk();
    }
}
