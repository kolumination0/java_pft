package ru.stqa.pft.sandbox;

public class MyFirstProgram {
	
	public static void main(String[] args) {

		hello("Oleg");

		Square s = new Square(9);
		System.out.println("Площадь квадрата со сторонами " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(8, 6);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
	}

	public static void hello(String s) {
		System.out.println("Hello, " + s + "!");
	}

}

