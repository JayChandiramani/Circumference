package com.jetbrain;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	double radius,circumference;
	Scanner Input=new Scanner(System.in);

	System.out.println("Please enter the radius in cm.");
	radius= Input.nextDouble();

	System.out.println("The formula used to calculate the circumference is 2 x 3.14 x "+radius+".");
	circumference=2*3.14*radius;
	System.out.println();
	System.out.println("The circumference of a circle with a radius of "+radius+"cm is "+circumference+"cm.");
    }
}
