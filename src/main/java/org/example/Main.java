package org.example;

import org.example.primenumber.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        long n = sc.nextLong();
        System.out.println(PrimeNumberOrNot.isPrime(n));

        ReverseString  r = new ReverseString();
        System.out.println("Enter a string");
        String s = sc.next();
        r.reverseString(s);

        DistinctCharactersOfString d = new DistinctCharactersOfString();
        System.out.println("Enter a string to eliminate duplicates");
        String k = sc.next();
        d.distinctString(k);

        ReverseWordINString.reversedWordInAString("Java code");


        CountOfDuplicateString.countStringOccurence("hello");



        NonRepeatingCharacters.nonRepeateCharacters();

     ReplaceCharacterOccuranceWithItsCount.count();

        SortingAStringbasedOnCharacters.sorting();
        PalindromeNumber.reverseNo(121);
        PalindromeString.revString("madam");
        CountEvenOrOddDigitsOfNumber.evenorOdd(123278678);
        LargestOfThreeNO.largestOf3num(10,20,30);
        FibonacciNumber.fibonacci(10);
        FactorialNumber.factorial(5);
        int [] arr ={12,1,2,2};
        SumOfArrayElements.sumArray(arr);

        int [] a1={1,2,3,4};
        int [] a2={1,2,3,4};


        TwoArraysAreEqualOrNot.equalOrNot(a1,a2);

        MissingNumberInArray.missingNoArray();
        MaxAndMinInArray.minAndMaxElement();
        DuplicateElementsInArray.duplicateElement();
        BinarySearch.binarySearch();
        BubleSort.bobbleSort();
        CountCharOccurance.charOccur();
        ReadFileFromPc.fileRead();
        ReadFileFromPc.writeFile();
        Print1To100NumberWithoutUsingNumber.withoutUsingNum();
        RemoveDuplicatesFromString.removeDuplicatesString();
        Anagram.anagram("aab","aaa");
        FirstNonRepeatingCharacterInAString.firstNonRepeatingChar("bbcceffea");
        RemovingAnElementFromAnArray.removeElementFromArray();
        PrintEvenLengthCharactersInString.lengthOfEvenChar();
        CountNoOfVowelsInAString.noOfVowels();
        CountNoOfCharactersPresentInaWordOfAString.noOfChars();

    }
}