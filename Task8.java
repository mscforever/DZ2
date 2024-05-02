package edu.training.les04.main;

public class Task8 {

	public static void main(String[] args) {
		// 8. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее
		// геометрическое модулей этих чисел.
		int a = 2, b = 4;
		double sAr, sG;

		sAr = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		sG = Math.sqrt(Math.abs(a) * Math.abs(b));

		System.out.println("Среднее арифметическое кубов чисел: " + sAr);
		System.out.println("Среднее геометрическое модулей чисел: " + sG);

	}

}