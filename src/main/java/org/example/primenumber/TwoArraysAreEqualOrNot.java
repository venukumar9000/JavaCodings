package org.example.primenumber;

public class TwoArraysAreEqualOrNot {

    public static void equalOrNot(int[] b1 , int []b2){

        boolean status =true;
        if(b1.length ==b2.length){
            for(int i=0;i<b1.length;i++){
                if(b1[i]!=b2[i]){
                    status=false;
                }

            }
        }else{
           status=false;
        }
        if(status==true){
            System.out.println("arrays r equal");
        }else {
            System.out.println("not equal");
        }



    }

}
