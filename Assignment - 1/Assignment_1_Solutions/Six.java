/*
6. Calculate Electricity Bill using below conditions:

        1 to 100 units   – Rs. 6/unit
        100 to 200 units – Rs. 8/unit
        200 to 300 units – Rs. 10/unit
*/

import java.util.Scanner;

public class Six {

    private static final int RATE_1_to_100 = 6;
    private static final int RATE_100_to_200 = 8;
    private static final int RATE_200_to_300 = 10;

    void calculateBill(int choice, int n){

        switch(choice){

            case 1:
                System.out.println("Your Electricity bill is: "+ n*RATE_1_to_100);
                break;

            case 2:
                System.out.println("Your Electricity bill is: "+ n*RATE_100_to_200);
                break;

            case 3:
                System.out.println("Your Electricity bill is: "+ n*RATE_200_to_300);
                break;

            default:
                System.out.println("Please enter a valid choice.");
        }
    }

    public static void main(String[] args) {

        Six s = new Six();
        Scanner sc = new Scanner(System.in);

        //choose
        System.out.println("1. For 1 to 100 units");
        System.out.println("2. For 100 to 200 units");
        System.out.println("3. For 200 to 300 units");

        System.out.print("\nEnter your choice: ");
        int choice = sc.nextInt();
        System.out.print("Enter your electricity bill units: ");
        int n = sc.nextInt();

        s.calculateBill(choice,n);


    }
}
