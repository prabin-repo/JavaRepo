package javaBasics;

public class Array2Dim {

	public static void main(String[] args) {

		String i[][] = new String[3][5];
		System.out.println(i.length);// no. of row
		System.out.println(i[0].length);// no. of col

		i[0][0] = "A";
		i[0][1] = "B";
		i[0][2] = "C";
		i[0][3] = "D";
		i[0][4] = "E";

		i[1][0] = "A1";
		i[1][1] = "B1";
		i[1][2] = "C1";
		i[1][3] = "D1";
		i[1][4] = "E1";

		i[2][0] = "A2";
		i[2][1] = "B2";
		i[2][2] = "C2";
		i[2][3] = "D2";
		i[2][4] = "E2";

		System.out.println(i[2][1]);
		System.out.println(i[0][4]);

		for(int row=0;row<i.length;row++) {
			for(int col=0;col<i[0].length;col++)
				System.out.println(i[row][col]);
		}
		
	}

}
