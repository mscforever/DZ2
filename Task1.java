package edu.training.les04.main;

public class Task1 {

	public static void main(String[] args) {
		// 1. Вычислить значение выражения по формуле (все переменные принимают
		// действительные значения):
		double a = 3, b = 4, c = 5;
		double x;

		x = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);

		System.out.println("Значение выражения: " + x);

	}

}
