//7. Write a program to convert Kilometers to miles using input taken from user.
// (One kilometer is equivalent to 0.6214 miles)

import java.util.Scanner;


public class Seven {

    //Constant declared
    private static final float MILE = 0.6214F;

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter km to convert it to miles: ");
        int km = sc.nextInt();

        System.out.println(km + " in miles is: " +  km*MILE);

    }
}
