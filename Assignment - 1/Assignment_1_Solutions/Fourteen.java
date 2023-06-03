//14. Write a Java program that takes a year from the user and prints whether it is a leap year or not.

import java.util.Scanner;


public class Fourteen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int year = sc.nextInt();

        if(year % 4==0 && (year % 100 != 0 || year % 400 == 0))
            System.out.println(year + " is a Leap year.");
        else
            System.out.println(year + " is not a Leap year.");

    }
}
