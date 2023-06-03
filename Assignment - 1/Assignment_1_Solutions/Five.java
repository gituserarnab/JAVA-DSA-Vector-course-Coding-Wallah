//Write a program to calculate CGPA using marks of three subjects (out of 100).

import java.util.Scanner;

public class Five {

    static float calculateCGPA(float[] sub){

        float sum=0;
        for(float element: sub){
            sum += element;
        }

        return (sum/30);
    }

    public static void main(String[] args) {

        float[] subjects = new float[3];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<3; i++){
            System.out.print("Enter marks of subject "+(i+1)+": ");
            subjects[i] = sc.nextFloat();
        }

        sc.close();
        System.out.println("\nCGPA is: "+Five.calculateCGPA(subjects));

    }
}
