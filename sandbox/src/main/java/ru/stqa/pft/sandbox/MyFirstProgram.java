package ru.stqa.pft.sandbox;

public class MyFirstProgram {
	
	public static void main(String[] args) {

		hello("Oleg");

		double s = 8;
		System.out.println("Площадь квадрата со сторонами " + s + " = " + Square(s));

		double a = 8;
		double b = 6;
		System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + Rectangle(a, b));
	}

	public static void hello(String s) {
		System.out.println("Hello, " + s + "!");
	}

	public static double Square(double a) {
		return a * 4;
	}

	public static double Rectangle(double a, double b) {
		return a * b;
	}
}

