package org.example.primenumber;

public class ReverseString {

    public void reverseString(String str){

//       char[] a =str.toCharArray();
//       for(int i=a.length-1;i>=0;i--){
//           System.out.println(a[i]);
//       }

       for(int i=str.length()-1;i>=0;i--){
           System.out.println(str.charAt(i));
       }
    }

}
