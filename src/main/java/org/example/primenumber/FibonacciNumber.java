package org.example.primenumber;

public class FibonacciNumber {

    public static void fibonacci(int n){

        int n1=0,n2=1,sum=0;

        System.out.println(n1+ " "+n2);
        for(int i=2;i<n;i++){
            sum=n1+n2;
            System.out.println("sum :"+sum);
            n1=n2;
            n2=sum;
        }
    }
}
