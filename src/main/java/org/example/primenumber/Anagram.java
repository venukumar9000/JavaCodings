package org.example.primenumber;

public class Anagram {

    public static void anagram(String str1 ,String str2){
        boolean flag = true;
        int [] count=new int[256];
        for(int i=0;i<str1.length();i++){
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){

                flag=false;
            }
        }
        if(flag==true){
            System.out.println("its an anagram");
        }
        else {
            System.out.println("it not a anagram");
        }
    }
}
