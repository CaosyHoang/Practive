package jsoft_1;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap n = ");
		int n = input.nextInt();
		int tong = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				tong += i;
		}
		System.out.println("tổng các ước của n = " + tong);
	}
}
