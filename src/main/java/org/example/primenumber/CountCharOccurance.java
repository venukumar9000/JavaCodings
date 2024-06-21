package org.example.primenumber;

public class CountCharOccurance {

    public static void charOccur(){

        String s = " java programming";

      int totalOccuranceOfa= ( s.length())-(s.replace("a","").length());
        System.out.println(totalOccuranceOfa);

    }
}
