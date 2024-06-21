package org.example.primenumber;

public class SumOfArrayElements {

    public static void sumArray(int[] n){
        int sum=0;
        for(int i=0;i<n.length-1;i++){
           sum =sum+n[i];
        }
        System.out.println(sum);
    }
    public static void evenOrOdd(int [] n){
        for(int i=0;i<n.length-1;i++){
            if(n[i]%2==0){
                System.out.println("even num"+n);
            }
            else {
                System.out.println("odd num"+n);
            }
        }
    }
}
