package org.example.primenumber;

import java.util.ArrayList;
import java.util.List;

public class RemovingAnElementFromAnArray {

    public static void removeElementFromArray() {
        int[] a = {1, 2, 3, 4, 5};
        int remove = 5;

        List<Integer> l = new ArrayList<>();

        for (int i=0;i<a.length;i++){
            if(a[i]!=remove){
                l.add(a[i]);
            }
        }
        System.out.println("after removing new array is :"+l);
    }
}