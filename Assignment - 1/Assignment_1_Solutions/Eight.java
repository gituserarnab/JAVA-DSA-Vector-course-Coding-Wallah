/*
8. Write a program to calculate :
        (A.)Area Of Triangle
        (B.)Area Of circle
        (C.)Perimeter of circle.
*/

import java.util.Scanner;


interface IShape
{

    //abstract methods
    void area();
    void perimeter();
}

class Circles implements IShape
{

    //instance variable
    float pi=3.14F;
    int radius;
    Circles(int radius)
    {
        this.radius = radius;
    }
    public void area()
    {
        System.out.println("The area of circle is: " + pi*radius*radius);
    }

    public void perimeter()
    {
        System.out.println("The perimeter of circle is: " + 2*pi*radius);
    }


}


class Triangles implements IShape
{
    private int base,height,side_1,side_2,tBase;

    Scanner sc = new Scanner(System.in);
    public void setTriangles(int base,int height,int side_1,int side_2,int tBase)
    {
        this.base = base;
        this.height = height;
        this.side_1 = side_1;
        this.side_2 = side_2;
        this.tBase = tBase;
    }

    public void area()
    {
        System.out.println( "The Area of Triangle is: "+(base*height)/2 );
    }

    public void perimeter()
    {
        System.out.println("\nChoose for perimeter:");
        System.out.println("1. For an equilateral triangle (all sides are equal): ");
        System.out.println("2. For an isosceles triangle (two sides are equal): ");
        System.out.println("3. For a scalene triangle (all sides are different): ");

        int choice = sc.nextInt();

        if(choice == 3 && side_1 != side_2 && side_2 != tBase && side_1 != tBase)
            System.out.println("The perimeter is: "+ (side_1+side_2+tBase) );
        else if (choice == 2 && (side_1 == side_2) && side_1!=tBase)
            System.out.println("The perimeter is: "+ ( (2 * side_1) + tBase) );
        else if(choice == 1 && ( ( (side_1+side_2+tBase)/3) == side_1))
            System.out.println("The perimeter is: " + (3 * side_1));
        else
            System.out.println("Provide a valid input.");

    }
}


class Eight
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Finding circle Area and Perimeter: ");
        System.out.print("Enter radius: ");
        int radius = sc.nextInt();

        Circles shapeC = new Circles(radius);
        shapeC.area();
        shapeC.perimeter();

        System.out.println("\nFinding Triangle Area and Perimeter: ");

        System.out.print("Enter Base: ");
        int base = sc.nextInt();
        System.out.print("Enter Height: ");
        int height = sc.nextInt();

        System.out.println("\nInput details for Perimeter of Triangle: ");

        System.out.print("Triangle Side_1 Length: ");
        int side_1 = sc.nextInt();
        System.out.print("Triangle Side_2 Length: ");
        int side_2 = sc.nextInt();
        System.out.print("Triangle Base Length: ");
        int tBase = sc.nextInt();

        Triangles shapeT = new Triangles();
        shapeT.setTriangles(base,height,side_1,side_2,tBase);
        shapeT.area();
        shapeT.perimeter();

    }

}

