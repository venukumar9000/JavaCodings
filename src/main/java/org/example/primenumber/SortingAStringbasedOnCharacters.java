package org.example.primenumber;

public class SortingAStringbasedOnCharacters {

    public static  void sorting() {

        String  inp = "Rock";

        char [] ch = inp.toCharArray();
         char temp;
        for(int i =0 ;i<ch.length;i++){
            for(int j=i+1 ;j<ch.length;j++){
                if(ch[i]>ch[j]){
                    temp =ch[i];
                    ch[i]=ch[j];
                    ch[j] =temp;
                }
            }
        }

        System.out.println(ch);


    }

}
