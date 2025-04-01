package cs101;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayTests {

	@Test
	void testA() {
		double[][] a = TwoDimArrays.a();
		assertEquals(3, a.length);
		assertEquals(1.2, a[1][2]);
		assertEquals(0.3, a[0][3]);
		assertEquals(2.0, a[2][0]);

	}

	@Test
	void testB() {
		boolean[][] b = TwoDimArrays.b();
		assertEquals(100, b.length);
		assertEquals(20, b[0].length);

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 20; j++) {
				assertEquals(true, b[i][j]);
			}

		}

	}

	@Test
	void testC() {
		String[][] c = TwoDimArrays.c();
		assertEquals(2, c.length);
		assertEquals(3, c[0].length);

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				assert (c[i][j].equals("hello"));
			}

		}
	}

	@Test
	void testD() {
		int[][] d = TwoDimArrays.d();
		assertEquals(3, d.length);
		assertEquals(2, d[0].length);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				assertEquals(8, d[i][j]);
			}

		}

	}

	@Test
	void testE() {
		int e = TwoDimArrays.e();
		assertEquals(4, e);

	}

	@Test
	void testF() {
		double[][] f = { { 2.0 }, { 3.0, 3.0 }, { 5.5, 5.5, 5.5 }, { 6.6, 6.6, 6.6, 6.6 } };
		assertEquals(1, TwoDimArrays.f(f));

		double[][] f2 = { { 2.0, 2.2, 4.4 }, { 3.0, 3.0 }, { 5.5 }, { 6.6, 6.6, 6.6, 6.6 } };
		assertEquals(3, TwoDimArrays.f(f2));

	}

	@Test
	void testG() {
		double[][] g = { { 2.0 }, { 3.0, 3.0 } };
		assertEquals(2, TwoDimArrays.g(g));

		double[][] g2 = { { 2.0, 2.2, 4.4 }, { 3.0, 3.0 }, { 5.5 }, { 6.6, 6.6, 6.6, 6.6 } };
		assertEquals(4, TwoDimArrays.g(g2));
	}

	@Test
	void testH() {
		double[][] h = { { 2.0, 5.4, 4.6, 9.2, 7.9 }, { 3.0, 3.0 }, { 5.5, 5.5, 5.5 }, { 6.6, 6.6, 6.6, 6.6 } };
		assertEquals(7.9, TwoDimArrays.h(h));

		double[][] h2 = { { 2.0, 2.2, 4.4, 5.5, 6.0, 7.8 }, { 3.0, 3.0 }, { 5.5 }, { 6.6, 6.6, 6.6, 6.6 } };
		assertEquals(6.0, TwoDimArrays.h(h2));

	}

	@Test
	void testH2() {
		double[][] h = { { 2.0, 5.4, 4.6, 9.2, 7.9 }, { 3.0, 3.0 }, { 5.5, 5.3, 5.3 }, { 6.6, 6.6, 6.6, 6.6 } };
		assertEquals(5.5, TwoDimArrays.h2(h));

		double[][] h2 = { { 2.0, 2.2, 4.4, 5.5, 6.0, 7.8 }, { 3.0, 3.0 }, { 5.5 }, { 6.6, 6.6, 6.6, 6.6 } };
		assertEquals(5.5, TwoDimArrays.h2(h2));

	}

	@Test
	void testI() {
		double[][][] i = new double[2][2][2];
		double[][][] i_out = TwoDimArrays.i(2);
		assertEquals(i.length, i_out.length);
		assertEquals(i[0].length, i_out[0].length);
		assertEquals(i[0][0].length, i_out[0][0].length);

		i = new double[10][10][10];
		i_out = TwoDimArrays.i(10);
		assertEquals(i.length, i_out.length);
		assertEquals(i[0].length, i_out[0].length);
		assertEquals(i[0][0].length, i_out[0][0].length);

	}

	@Test
	void testJ() {
		int[][] out = { { 10, 6, 6 }, { 3, 4, 6 }, { 10, 12, 9 } };
		equals(out, TwoDimArrays.j());

	}

	@Test
	void testK_same() {
		int[][] foo = { { 0, 1, 3 }, { 2, 4, 5 }, { 10, 0, 0 } };
		int[][] bar = { { 7, 7, 7 }, { 4, 4, 4 }, { 1, 1, 1 } };
		int[][] out = { { 7, 8, 10 }, { 6, 8, 9 }, { 11, 1, 1 } };
		equals(out, TwoDimArrays.k(foo, bar));

	}

	@Test
	void testK_diff() {
		int[][] foo = { { 0, 1 }, { 2, 4, 5 }, { 10 } };
		int[][] bar = { { 7, 7 }, { 4, 4, 4 }, { 1 } };
		int[][] out = { { 7, 8 }, { 6, 8, 9 }, { 11 } };
		equals(out, TwoDimArrays.k(foo, bar));

	}

	// helper
	void equals(int[][] a, int[][] b) {
		assertEquals(a.length, b.length);

		for (int i = 0; i < a.length; i++) {
			assertEquals(a[i].length, b[i].length);
			for (int j = 0; j < a[i].length; j++) {
				assertEquals(a[i][j], b[i][j]);
			}

		}

	}

}
