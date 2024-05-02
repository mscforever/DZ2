package edu.training.les04.main;

public class Task11 {

	public static void main(String[] args) {
		// 11. Известна длина окружности. Найти площадь круга, ограниченного этой
		// окружностью.
		double x = 9;
		double s, r;

		r = x / (2 * Math.PI);
		s = Math.PI * Math.pow(r, 2);

		System.out.println("Площадь круга, ограниченного окружностью с длиной " + x + ": " + s);

	}

}