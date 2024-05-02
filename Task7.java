package edu.training.les04.main;

public class Task7 {

	public static void main(String[] args) {
		// 7. Найти произведение цифр заданного четырехзначного числа.
		int n = 4321, number = n;
		int x = 1;

		while (n > 0) {
			int d = n % 10;
			x *= d;
			n /= 10;
		}

		System.out.println("Произведение цифр числа " + number + ": " + x);

	}

}