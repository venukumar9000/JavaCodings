package org.example.primenumber;

import java.util.HashMap;
import java.util.Map;

public class CountOfDuplicateString {

    public static void countStringOccurence(String s ){

        Map<Character,Integer> map = new HashMap<>();

        char [] c = s.toCharArray();

        for(char c1 :c){

            if(map.containsKey(c1)){
                int count = map.get(c1);
                map.put(c1 ,count+1);
            }
            else {
                map.put(c1 , 1);
            }
        }
        System.out.println(map);

    }
}
