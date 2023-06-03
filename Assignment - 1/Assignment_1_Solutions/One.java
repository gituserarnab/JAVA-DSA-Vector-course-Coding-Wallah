//1. Write a program to sum three numbers in Java and Input should be taken by the User.

import java.util.Scanner;

public class One {

    int calculateSum(int[] arr){

        int sum=0;
        for(int element: arr){
            sum += element;
        }

        return sum;
    }

    public static void main(String[] args) {

        //Creating object of One class
        One ob1 = new One();

        //Taking an array to store 3 numbers
        int[] arr = new int[3];

        //To take user input
        Scanner sc = new Scanner(System.in);

        //Took the numbers and stored it in the array
        for(int i=0; i<=2; i++){
            System.out.print("Enter Number "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }

        //Calling the sum() to calculate
        System.out.println("\nThe sum is: "+ob1.calculateSum(arr));


    }
}