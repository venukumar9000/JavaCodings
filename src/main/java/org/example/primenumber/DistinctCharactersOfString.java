package org.example.primenumber;

import java.util.LinkedHashSet;
import java.util.Set;

public class DistinctCharactersOfString {

    public  void distinctString(String str ){

        StringBuffer sb = new StringBuffer();
        Set<Character> set = new LinkedHashSet<>();
        for(int i =0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        for(Character c :set){
            sb.append(c);
        }
        System.out.println(sb);

    }
}
