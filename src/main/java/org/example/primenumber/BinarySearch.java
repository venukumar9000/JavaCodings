package org.example.primenumber;

public class BinarySearch {

    public static void binarySearch(){
        int [] a ={1,2,3,4,5,6,7,8,9};

        int search=6;

        int low=0;
        int high =a.length-1;
        boolean flag =false;

        while(low<=high){
            int mid = (low+high)/2;

            if(a[mid]==search){
                System.out.println("element found");
                flag=true;
                break;
            }
            if(a[mid]<search){
                low=mid+1;
            }
            if(a[mid]>search){
                high=mid-1;
            }
        }
        if(flag==false){
            System.out.println("Not found");
        }
    }

}
