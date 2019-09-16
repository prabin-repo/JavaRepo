package javaBasics;

public class IfElse {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		if (b > a) {
			System.out.println("b is greater than a");
		} else {
			System.out.println("a is greater than b");
		}

		int c = 20;
		int d = 20;

		if (c == d) {
			System.out.println("c and d are equal");
		} else {
			System.out.println("c and are not equal");
		}

		int a1 = 400;
		int b1 = 500;
		int c1 = 300;
		if (a1 > b1 & a1 > c1) {
			System.out.println("a1 is greater");
		} else if (b1 > c1) {
			System.out.println("b1 is greater");
		} else {
			System.out.println("c1 is greater");
		}
	}

}
