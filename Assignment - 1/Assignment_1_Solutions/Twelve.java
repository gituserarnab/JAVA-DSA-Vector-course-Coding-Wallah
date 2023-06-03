//12. Write a Java program to find the area of a circle using the given radius ((π) = 3.14) give integer as a output.


import java.util.Scanner;

public class Twelve {

    private static final float PI = 3.14F;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        int radius = sc.nextInt();

        System.out.println("\nArea of Circle is: " + (int)PI*radius*radius );

    }
}
