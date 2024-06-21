package org.example.primenumber;

import java.util.stream.Collectors;

public class RemoveDuplicatesFromString {

    public static void removeDuplicatesString(){
        String str ="venukumar";

       str=  str.chars()
                 .distinct()
                 .mapToObj(c->String.valueOf((char) c))
                 .collect(Collectors.joining());

        System.out.println(str);
    }


}
