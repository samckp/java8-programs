package edu.java8.poc;

public class MaxMin {

    public static void main(String[] args) {

        int [] arr = new int [] {25, 11, 7, 75, 56, 99};
        findMin(arr);
        findMax(arr);
        System.out.println(getSecondLargest(arr));
    }

    static public void findMin(int [] arr){

        int min = arr[0];

        for(int i=0;i<arr.length;i++){

            if(min > arr[i]){
                min =arr[i];
            }
        }
        System.out.println("Minimum ::"+ min);
    }

    static public void findMax(int [] arr){

        int max = arr[0];
        for(int i=0;i<arr.length;i++){

            if(max < arr[i]){
                max =arr[i];
            }
        }
        System.out.println("Maximum ::"+ max);
    }

    public static int getSecondLargest(int[] arr){
        int max1 = arr[0];
        int max2 = arr[1];
        for (int i = 2; i < arr.length; i++){
            if (arr[i] > max2)
            {
                max2 = arr[i];
            }

            if (max2 > max1)
            {
                int temp = max1;
                max1 = max2;
                max2 = temp;
            }
        }
        return max2;
    }
}
