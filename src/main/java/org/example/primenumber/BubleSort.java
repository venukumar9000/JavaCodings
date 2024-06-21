package org.example.primenumber;

import java.util.Arrays;

public class BubleSort {

    public static void bobbleSort(){
        int [] a ={2,1,3,3,4,5,6,7};

        System.out.println("Before Sorting :"+ Arrays.toString(a));

//        for(int i=0;i<a.length-1;i++){
//            for(int j=0;j<a.length-1;j++){
//                if(a[j]>a[j+1]){
//                    int temp =a[j];
//                    a[j]=a[j+1];
//                    a[j+1]=temp;
//                }
//
//            }
//        }
        Arrays.parallelSort(a);
        System.out.println("after sorting : "+Arrays.toString(a));

    }
}
