package org.example.primenumber;

public class PalindromeNumber {
    
    public static void reverseNo(int n){

        int tem =n;
        int rev = 0;
        while(n!=0){
            rev =rev*10 +n%10;
            n=n/10;
        }
        System.out.println("reversed number is :"+ rev);
        if(rev == tem){
            System.out.println("its a palindrome :"+tem);
        }
        else{
            System.out.println("Not a palindrome");
        }
    }

}
