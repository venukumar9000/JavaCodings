package org.example.primenumber;

import java.util.Arrays;

public class ReplaceCharacterOccuranceWithItsCount {

    public static  void count(){

        String str = "opentext";
        char charToReplace = 't';

        if(str.indexOf(charToReplace)==-1){
            System.out.println("given character is not present");
            System.exit(0);
        }
//        char [] ch =str.toCharArray();
//        int count =1;
//        for(int i=0 ;i<ch.length;i++){
//            if(ch[i] == charToReplace){
//                ch[i] =String.valueOf(count).charAt(0);
//                count++;
//            }
//        }
//        System.out.println(Arrays.toString(ch));

        int count=1;
        for (int i=0 ;i<str.length();i++){
            if(str.charAt(i)== charToReplace){
              str =  str.replaceFirst(String.valueOf(charToReplace),String.valueOf(count));
              count++;
            }
        }
        System.out.println(str);
    }
}
