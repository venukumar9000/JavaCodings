package org.example.primenumber;

public class CountNoOfCharactersPresentInaWordOfAString {
    public static void noOfChars() {

        String str ="java program";

      String [] words = str.split("\\s+");

      for (String word :words){
          System.out.println(word +"-->"+word.length());
      }

    }
}
