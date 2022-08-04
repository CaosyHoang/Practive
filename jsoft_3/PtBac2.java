package jsoft_3;

import java.util.Scanner;

public class PtBac2 {
	public static Scanner scanner = new Scanner(System.in);
	private float a;
	private float b;
	private float c;

	public void input() {
		System.out.print("Nhap a = ");
		a = scanner.nextFloat();
		scanner.nextLine();
		System.out.print("Nhap b = ");
		b = scanner.nextFloat();
		scanner.nextLine();
		System.out.print("Nhap c = ");
		c = scanner.nextFloat();
	}

	public void giaiPt() {
		float beta = b * b - 4 * a * c;
		if (beta == 0)
			System.out.print("Phuong trinh co nghiem kep:\nx = " + (-b / 2 * a));
		if (beta > 0) {
			float x1 = (-b + (float) Math.sqrt(beta)) / 2 * a;
			float x2 = (-b - (float) Math.sqrt(beta)) / 2 * a;
			System.out.print("Phuong trinh co 2 nghiem:\nx1 = " + x1 + "\nx2 = " + x2);
		} else
			System.out.print("Phuong trinh vo nghiem!");
	}

	public static void main(String[] args) {
		PtBac2 pt = new PtBac2();
		pt.input();
		pt.giaiPt();
	}
}
