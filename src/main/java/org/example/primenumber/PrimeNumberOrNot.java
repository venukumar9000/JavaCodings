package org.example.primenumber;

public class PrimeNumberOrNot {

    public static boolean isPrime(long n){
        if(n<2){
            return false;
        }
        for(long i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
