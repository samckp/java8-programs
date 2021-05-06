package edu.java8.poc;

public class PrimeNumber {

    public static void main(String[] args) {

        int num=0;

        for(int i=0;i<100;i++){

            int counter =0;
            for(num=i;num>=1;num--){

                if(i%num==0){
                    counter++;
                }
            }
            if(counter==2){
                System.out.println(i);
            }
        }
    }
}
