package edu.training.les04.main;

public class Task4 {

	public static void main(String[] args) {
		// 4. Заданы координаты трех вершин треугольника (х1, у2),(х2, у2),(х3, у3).
		// Найти его периметр и площадь.
		double x1 = 0, y1 = 0;
		double x2 = 0, y2 = 2;
		double x3 = 2, y3 = 0;
		double a, b, c, p, pP, s;

		a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		c = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		p = a + b + c;
		pP = (a + b + c) / 2;
		s = Math.sqrt(pP * (pP - a) * (pP - b) * (pP - c));

		System.out.println("Периметр треугольника: " + p);
		System.out.println("Площадь треугольника: " + s);

	}

}