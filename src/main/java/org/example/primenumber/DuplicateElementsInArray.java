package org.example.primenumber;

public class DuplicateElementsInArray {

    public static void duplicateElement(){
        String [] str = {"java","python","java"};

        boolean flag =false;
        for(int i=0;i< str.length;i++){
            for(int j=i+1;j< str.length;j++){
                if(str[i]==str[j]){
                    System.out.println("Found Duplicate :"+str[i]);
                    flag=true;
                }
            }
        }
        if(flag==false){
            System.out.println("not found");
        }
    }
}
