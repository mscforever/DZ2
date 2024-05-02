package edu.training.les04.main;

public class Task5 {

	public static void main(String[] args) {
		// 5. Вычислить длину окружности и площадь круга одного и того же заданного
		// радиуса R.
		double r = 10;
		double l, s;

		l = 2 * Math.PI * r;
		s = Math.PI * Math.pow(r, 2);

		System.out.println("Длина окружности: " + l);
		System.out.println("Площадь круга: " + s);

	}

}