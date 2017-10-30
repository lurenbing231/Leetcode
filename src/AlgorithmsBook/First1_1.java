package AlgorithmsBook;

import java.util.Scanner;

import org.junit.Test;

public class First1_1 {

	private Scanner x;

	@Test
	public void zl1() {
		int sum = 0;
		for (int i = 0; i < 1000; i++)
			for (int j = 0; j < i; j++)
				sum++;
		System.out.println(sum);
	}

	@Test
	public void zl2() {
		long sum = 0;
		for (int i = 1; i < 1000; i *= 2)
			for (int j = 0; j < 1000; j++) {
				sum++;
			}
		System.out.println(sum);
	}

	@Test
	public void zl3() {
		System.out.println('b');
		System.out.println('b' + 'c');
		System.out.println((char) ('a' + 4));
	}

	@Test
	public void zl4() {
		x = new Scanner(System.in);
		int N = x.nextInt();
		String s = "";
		for (int n = N; n > 0; n /= 2)
			s = (n % 2) + s;
		System.out.println(s);
	}

	@Test
	public void zl5() {
		boolean[][] b = new boolean[2][2];
		b[0][0] = true;
		b[0][1] = false;
		b[1][0] = true;
		b[1][1] = false;
		twoBoolean(b);
	}

	public void twoBoolean(boolean[][] b) {
		System.out.println(b.length);// ��ά�����������
		System.out.println(b[0].length);// ��ά��������0�е�����
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				if (b[i][j] == true)
					System.out.print("*");
				else
					System.out.print("#");
			}
			System.out.println();
		}
	}

	@Test
	public void zl6() {
		int[] a = new int[10];
		int M = 10;
		for (int i = 0; i < a.length; i++) {
			a[i] = 1;
		}
		int[] b = histogram(a, M);
		for (int i = 0; i < M; i++) {
			System.out.println(b[i]);
		}
	}

	public static int[] histogram(int[] a, int M) {
		int[] b = new int[M];
		int n = 0;
		int m = 0;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == a[j]) {
					n++;
				}
				if (n < M) {
					b[i] = n;
				}
			}
			n = 0;
		}
		for (int i = 0; i < M; i++) {
			m = m + b[i];
		}
		return b;
	}

	@Test
	public void zl7() {
		int a = 3;
		int b = 11;
		System.out.println(mystery(a, b));
	}

	public static int mystery(int a, int b) {
		System.out.println(a + "," + b);
		if (b == 0)
			return 1;
		if (b % 2 == 0)
			return mystery(a * a, b / 2);
		return mystery(a * a, b / 2) * a;
	}

	// ����
	@Test
	public void zl8() {
		int a = 0;
		int b = 1;
		int m = 0;
		while (true) {
			m = a % b;
			if (m == 0) {
				break;
			} else {
				a = b;
				b = m;
			}
		}
		if (b == 1) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	public static double dot(double[] x, double[] y) {// �������
		double a = 0;
		if (x.length != y.length) {
			return a;
		} // �˴��׳��쳣
		for (int i = 0; i < x.length; i++)
			a += x[i] * y[i];
		return a;
	}

	public static double[][] transpose(double[][] a) {// ת�þ���
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a[0].length; j++) {
				double temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
		return a;
	}

	/*
	 * ����ĳ˻����壺һ��n��m�еľ������һ��m��p�еľ��󣬵õ��Ľ����һ��n��p�еľ���
	 * ���еĵ�i�е�j��λ���ϵ�������ǰһ�������i���ϵ�m�������һ�������j���ϵ�m������Ӧ ��˺�����m���˻��ĺ͡�
	 */
	static double[][] mult(double[][] a, double[][] b) {// ����;���֮��
		int M = a[0].length;
		int N = a.length;
		int P = b[0].length;
		double[][] c = new double[M][P];
		if (M != b.length) {
			System.out.println("a������������b��������ͬ!!");
			return null;
		} // �˴��׳��쳣
		for (int i = 0; i < N; i++)
			for (int j = 0; j < P; j++) {
				for (int m = 0; m < M; m++)
					c[i][j] += a[i][m] * b[m][j];
			}
		return c;
	}

	public static double[] mult(double[][] a, double[] x) {// ���������֮��
		int N = a.length;
		double[] c = new double[N];
		int M = a[0].length;
		if (M != x.length) {
			System.out.println("�������������������������ͬ");
			return null;
		} // �˴��׳��쳣
		for (int i = 0; i < N; i++) {
			for (int m = 0; m < M; m++)
				c[i] += a[i][m] * x[m];
		}
		return c;
	}

	public static double[] mult(double[] y, double[][] a) { // �����;���֮��
		int N = y.length;
		double[] c = new double[N];
		int M = y.length;
		if (M != a[0].length) {
			System.out.println("�����ĳ��ȱ���������������ͬ��");
			return null;
		} // �˴��׳��쳣
		for (int i = 0; i < N; i++) {
			for (int m = 0; m < M; m++)
				c[i] += a[i][m] * y[i];
		}
		return c;
	}
}