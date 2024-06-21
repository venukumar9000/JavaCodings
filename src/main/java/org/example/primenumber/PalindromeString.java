package org.example.primenumber;

public class PalindromeString {

    public static void revString(String str){

        String s =str;
        String rev ="";
        char [] c =str.toCharArray();
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+c[i];
        }
        if(s.equalsIgnoreCase(rev)){
            System.out.println("palindrome string");
        }
        else {
            System.out.println("Not a palindrome");
        }

    }

}
