package edu.java8.poc;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        int arr[] = {10,2,6,22,8,7,9,5};

        secondSmallest(arr);

        System.out.println(polindrom("mmdaa"));
        System.out.println(polindrom("adda"));
        System.out.println(polindrom("Test"));

    }

    public static void secondSmallest(int arr[]){

        //Arraylist find second smallest no.
        int first  = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){

            /* If current element is smaller than first
              then update both first and second */
            if(first > arr[i]){
                second = first;
                first = arr[i];
            }
            else if (arr[i] < second && arr[i] != first)
                second = arr[i];
        }
        System.out.println("second smallest second number : " + second);
    }

    public static boolean polindrom(String str){

        int i = 0, j = str.length() - 1;

        while(i < j){

            char s1 = str.charAt(i);
            char s2 = str.charAt(j);
            if( s1 != s2){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
