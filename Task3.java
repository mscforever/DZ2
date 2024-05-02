package edu.training.les04.main;

public class Task3 {

	public static void main(String[] args) {
		// 3. Вычислить расстояние между двумя точками с данными координатами (х1, у1) и
		// (x2, у2).
		double x1 = 1, y1 = 1, x2 = 5, y2 = 10;
		double t;

		t = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		System.out.println("Расстояние между двумя точками: " + t);

	}

}