package org.example.primenumber;

public class MaxAndMinInArray {
    public static void minAndMaxElement(){
        int [] a = {20,3,34,45,5,67,19};

        int max=a[0];
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }else if(a[i]<min){
                min=a[i];

            }

        }
        System.out.println("max val is :"+ max);
        System.out.println("min val is : "+min);
    }
}
