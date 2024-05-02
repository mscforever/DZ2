package edu.training.les04.main;

public class Task10 {

	public static void main(String[] args) {
		// 10. Дана сторона равностороннего треугольника. Найти площадь этого
		// треугольника, его высоту, радиусы вписанной и описанной окружностей.
		double x = 2;
		double s, h, inR, outR;

		s = (Math.sqrt(3) / 4) * x * x;
		h = (Math.sqrt(3) / 2) * x;
		inR = (Math.sqrt(3) / 6) * x;
		outR = (Math.sqrt(3) / 3) * x;

		System.out.println("Площадь равностороннего треугольника: " + s);
		System.out.println("Высота равностороннего треугольника: " + h);
		System.out.println("Радиус вписанной окружности: " + inR);
		System.out.println("Радиус описанной окружности: " + outR);

	}

}