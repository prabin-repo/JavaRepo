package javaBasics;

public class ArrayConcept {

	public static void main(String[] args) {

		// Array-- to store similar data type values in a array variable
		// DIadvantage 1= Size is fixed which is static array-- to overcome we use
		// collections--ArrayList, Hashtable--Dynamic Array
		// Disadvantage 2= Data type should be similar--to overcome we use object Array

		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[2]);
		System.out.println(i.length);// length of array

		// print all the value of array==use for loop

		for (int j = 0; j < i.length; j++) {

			System.out.println(i[j]);
		}

		double d[] = new double[3];

		d[0] = 11.11;
		d[1] = 22.22;
		d[2] = 33.33;

		System.out.println(d[1]);

		for (int k = 0; k < d.length; k++) {
			System.out.println(d[k]);
		}

		Object obj[] = new Object[4];
		obj[0] = "PRABIN";
		obj[1] = 123;
		obj[2] = "p";
		obj[3] = 22.33;

		System.out.println(obj[0]);
		System.out.println(obj.length);

		for (int p = 0; p < obj.length; p++) {
			System.out.println(obj[p]);
		}

	}

}
