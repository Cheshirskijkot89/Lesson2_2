package chizhenko;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double p;
		double area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the first side of the triangle");
		a = sc.nextDouble();
		
		System.out.println("Please enter the second side of the triangle");
		b = sc.nextDouble();
		
		System.out.println("Please enter the third side of the triangle");
		c = sc.nextDouble();
		
		sc.close();
		
		p = (a+b+c) / 2;
		
		area = Math.sqrt(p * (p-a) * (p-b) * (p-c));
		
		System.out.println("Area of ​​a triangle " + area);

	}

}
