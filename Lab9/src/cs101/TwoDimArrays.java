package cs101;

import java.util.Arrays;

public class TwoDimArrays {

	// 3 points
	public static double[][] a() {

		double[][] a = new double[3][4];

		// TODO: set the element in row 1, column 2 to be 1.2

		// TODO: set the element in row 0, column 3 to be 0.3

		// TODO: set the element in row 2, column 0 to be 2.0

		return a;

	}

	// 7 points
	public static boolean[][] b() {

		boolean[][] b = new boolean[100][20];

		// TODO: use a nested for loop to set all of the elemets in array b to be true

		return b;

	}

	// 5 points
	public static String[][] c() {

		// TODO: declare a 2D String array with 2 rows and 3 columns

		// TODO: set all of the elements to "hello". You can use any method you
		// like to do this

		// TODO: return the array you just created (replace null)
		return null;

	}

	// 5 points
	public static int[][] d() {

		// TODO: declare a 2D int array with 3 rows and 2 columns using a list of
		// literals
		// All elements should be value 8

		// TODO: return the array you just created (replace null)
		return null;

	}

	// 3 points
	public static int e() {

		int[][] e = { { 0, 1, 2 }, { 5, 6 }, { 7, 8, 9, 10 } };

		// Notice that e is "ragged" - the rows have different lengths (numbers of
		// columns)

		// TODO: use the index notation (for example, e[i]) and the `length` field of an
		// array (i.e. array.length)
		// to return the length of the last row.
		return 0;

	}

	// 3 points
	public static int f(double[][] arr) {

		// TODO: return the length of the 1st row of arr (number of cols in 3rd row)
		return 0;

	}

	// 3 points
	public static int g(double[][] arr) {

		// TODO: return the number of rows in arr
		return 0;

	}

	// 3 points
	public static double h(double[][] arr) {

		// TODO: return the element in arr at row 0, column 4
		return 0;

	}

	// 3 points
	public static double h2(double[][] arr) {

		// TODO: return the element in arr at row 2, column 0
		return 0;

	}

	// 5 points
	public static double[][][] i(int n) {

		// TODO: declare a 3D double array with dimensions n by n by n
		// you can leave the elements set to the default value

		// TODO: return the array you just created (replace null)
		return null;

	}

	// 7 points
	public static int[][] j() {

		int[][] foo = { { 1, 2, 3 }, { 3, 4, 5 }, { 7, 7, 7 } };
		int[][] bar = { { 9, 4, 3 }, { 0, 0, 1 }, { 3, 5, 2 } };

		// You are given 2D arrays foo and bar in this function

		// TODO: declare a new 2D int array called `arr`
		// TODO: use a nested for loop to set the element of `arr` at row i, column j
		// to:
		// the element of `foo` at row i, column j PLUS the element of `bar` at row i,
		// column j

		// TODO: return the array you just created (replace null)
		return null;

	}

	// 10 points
	public static int[][] k(int[][] foo, int[][] bar) {
		// You are given 2D arrays foo and bar in this function, but this time, you do
		// not know their lengths
		// NOTE!! An array may have rows with different lengths
		// (but you can be assured the two arrays match)

		// TODO: use a nested for loop to set the element of `bar` at row i, column j
		// to:
		// the element of `foo` at row i, column j PLUS the element of `bar` at row i,
		// column j

		return bar;

	}

	// you may use this function to print out results
	public static void main(String[] args) {

	}

}
