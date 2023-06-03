//4. Write a program to get a number from the user and print whether it is positive or negative.


import java.util.Scanner;

public class Four {

    void symbol(int num){

        if(num > 0)
            System.out.println("The number is positive.");
        else
            System.out.println("The number is negative.");
    }

    public static void main(String[] args) {

        //Creating a object
        Four f = new Four();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        f.symbol(num);

    }
}
