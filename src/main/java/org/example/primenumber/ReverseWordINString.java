package org.example.primenumber;

import java.util.Arrays;

public class ReverseWordINString {

    public static void reversedWordInAString(String str) {


       String [] words = str.split(" ");
        String reverse ="";
       for(String word :words){
           String rev ="";
           for(int i=word.length()-1;i>=0;i--){
               rev = rev + word.charAt(i);
           }
           reverse = reverse + rev + " ";
       }
        System.out.println(reverse);


    }

}
