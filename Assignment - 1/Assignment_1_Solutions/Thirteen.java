//13. Write a Java program to find the number of days in a month.
/*
Month	    Number of Days
--------    ----------------
January	    31
February    28 or 29 (in leap years)
March	    31
April	    30
May	    31
June	    30
July	    31
August	    31
September   30
October	    31
November    30
December    31
 */

import java.util.Scanner;


public class Thirteen {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("1. January\n 2. February\n 3. March\n 4. April\n 5. May\n 6. June\n 7. July\n 8. August\n" +
                "9. September\n 10. October\n 11.November\n 12.December");
        System.out.print("\n\nEnter your choice: ");

        int choice = sc.nextInt();


        int[] days = {0,31,0,31,30,31,30,31,31,30,31,30,31};

        if(choice == 2){
            System.out.print("As it is February. Please enter the Year: ");
            int year = sc.nextInt();
            if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
                System.out.println("\nThe month is of 29 days.");
            else
                System.out.println("\nThe month is of 28 days.");
        }
        else if(choice == 1 || (choice > 2 && choice <=12))
            System.out.println("\nThe month November is of " + days[choice] + " days.");
        else
            System.out.println("Please enter a valid choice.");

    }
}











