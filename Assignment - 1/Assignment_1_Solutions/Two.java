//2. Write a program to Divide two numbers where num1>num2 and num2 != 0 .

import java.util.Scanner;


public class Two {

    static float divide(float num1, float num2) {

        float result=0;
        return result=num1/num2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter num2: ");
        float num2 = sc.nextFloat();

        //Condition
        if (num1 > num2 && num2 != 0)
            System.out.printf("\nThe result is: %.2f%n",Two.divide(num1, num2));
        else
            System.out.println("Please enter valid input.");

    }
}