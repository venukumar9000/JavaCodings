package org.example.primenumber;

public class CountEvenOrOddDigitsOfNumber {

    public static void evenorOdd(int n ){

        int evencount=0;
        int oddCount=0;
        int temp ;

        while (n!=0){
            int k = n%10;
            if(k%2==0){
                evencount=evencount+k;

            }
            else {
                oddCount+=k;
            }
           n= n/10;
        }
        System.out.println("evn :"+ evencount);
        System.out.println("odd: "+oddCount);
        System.out.println();
    }
}
