package edu.training.les04.main;

public class Task9 {

	public static void main(String[] args) {
		// 9. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и
		// объем этого куба.
		double a = 2;
		double sGr, sPoln, v;

		sGr = Math.pow(a, 2);
		sPoln = 6 * sGr;
		v = Math.pow(a, 3);

		System.out.println("Площадь грани: " + sGr);
		System.out.println("Площадь полной поверхности: " + sPoln);
		System.out.println("Объем куба: " + v);

	}

}