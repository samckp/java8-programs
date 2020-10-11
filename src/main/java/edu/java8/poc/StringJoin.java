package edu.java8.poc;

import java.time.ZoneId;

public class StringJoin {

    public static void main(String[] args) {

        String str = String.join("/", "usr","tmp","opt");
        System.out.println("joined str :: "  + str);

        String ids = String.join(", ", ZoneId.getAvailableZoneIds());
        System.out.println(ids);
    }
}
