package org.example.primenumber;

public class CountNoOfVowelsInAString {

    public static void noOfVowels(){

        String str ="manaman";

        int count=0;
        char [] ch = str.toCharArray();

        for(char c :ch){

            switch (c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }

        }
        System.out.println("no of vowels in a string is :"+count);
    }
}
