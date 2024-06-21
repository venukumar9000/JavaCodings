package org.example.primenumber;

public class PrintEvenLengthCharactersInString {

    public static void lengthOfEvenChar(){

        String str ="hell world we lol";

        for(String s:str.split(" ")){
            if(s.length()%2==0){
                System.out.println(s);
            }
        }
    }
}
