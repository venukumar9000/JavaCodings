package org.example.primenumber;

public class NonRepeatingCharacters {

    public static void nonRepeateCharacters(){
        String input="AABBFCC";
        for(int i=0 ;i<input.length();i++){
            boolean unique =true;


            for(int j=0; j < input.length();j++){
                if( i!=j && input.charAt(i) == input.charAt(j)){
                    unique=false;
                    break;
                }
            }
            if(unique){
                System.out.println(input.charAt(i));
                break;
            }
        }

    }
}
