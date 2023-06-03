//3. Write a program to print whether a number is even or odd, from the user.Also take input.

import java.util.Scanner;

public class Three {

    static void EvenOrOdd(int n){

        if(n%2 == 0)
            System.out.println("The number is Even.");
        else
            System.out.println("The number is Odd.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        Three.EvenOrOdd(num);
    }
}
