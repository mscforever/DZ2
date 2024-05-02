package edu.training.les04.main;

public class Task2 {

	public static void main(String[] args) {
		// 2. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b
		// двух катетов.
		double a = 2, b = 3;
		double p, s, c;

		c = Math.sqrt(a * a + b * b);
		p = a + b + c;
		s = a * b / 2;

		System.out.println("Периметр треугольника: " + p);
		System.out.println("Площадь треугольника: " + s);

	}

}