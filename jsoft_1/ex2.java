package jsoft_1;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap a = ");
		int a = input.nextInt();
		System.out.print("Nhap b = ");
		int b = input.nextInt();
		System.out.print("Nhap c = ");
		int c = input.nextInt();
		if (Math.abs(a - b) < c && Math.abs(a - c) < b && Math.abs(b - c) < a) {
			if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
				if (a == b || a == c || b == c)
					System.out.println("Tam giac vuong can");
				else
					System.out.println("Tam giac vuong");

			} else if (a == b && b == c) {
				System.out.println("Tam giac deu");
			} else if (a == b || a == c || b == c) {
				System.out.println("Tam giac can");
			} else {
				System.out.println("Tam giac thuong");
			}
		} else {
			System.out.println("Khong phai tam giac");
		}
	}
}
