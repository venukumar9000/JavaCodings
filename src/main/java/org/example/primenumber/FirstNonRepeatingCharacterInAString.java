package org.example.primenumber;

public class FirstNonRepeatingCharacterInAString {

    public static void firstNonRepeatingChar(String str){
        boolean flag =true;

        for(char i :str.toCharArray()){
            if(str.indexOf(i) ==str.lastIndexOf(i)){
                System.out.println("The first non repeating charetcter is :"+i);
                flag=false;
                break;
            }
        }
        if(flag==true){
            System.out.println("there is no first non repating charecter");
        }
    }

}
