//11. Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

import java.util.Scanner;


public class Eleven {

    static int sum=0;

    static int sum(int[] x){

        for(int e: x){
            sum += e;
        }

        return sum;
    }

    static int avg(int[] y){

        return(sum/5);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0; i<5; i++){
            System.out.print("Enter number "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\nThe Sum is: " + Eleven.sum(arr));
        System.out.println("The Average is: "+ Eleven.avg(arr));

    }

}
