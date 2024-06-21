package org.example.primenumber;

public class LargestOfThreeNO {

    public static void largestOf3num(int a,int b,int c){
        int lar = a>b?a:b;
        lar =c>lar?c:lar;
        System.out.println(lar);


    }
}
