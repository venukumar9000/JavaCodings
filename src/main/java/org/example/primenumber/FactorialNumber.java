package org.example.primenumber;

public class FactorialNumber {
    public static void factorial(int n){
        int p =1;
        for(int i=1;i<=n;i++){
            p=p*i;
        }
        System.out.println(p);
    }
}
