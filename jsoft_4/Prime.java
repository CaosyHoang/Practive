package jsoft_4;

import java.util.Scanner;

public class Prime {
	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		else {
			for (int i = 2; i * i <= n; i++) {
				if (n % i == 0)
					return false;
			}
		}
		return true;
	}

	public static boolean isPrime(long n) {
		if (n < 2)
			return false;
		else {
			for (int i = 2; i * i <= n; i++) {
				if (n % i == 0)
					return false;
			}
		}
		return true;
	}

	public static boolean isPrime(float n) {
		if (Math.ceil(n) == Math.floor(n))
			return false;
		else if (n < 2)
			return false;
		else {
			for (int i = 2; i * i <= n; i++) {
				if (n % i == 0)
					return false;
			}
		}
		return true;
	}

	public static boolean isPrime(double n) {
		if (Math.ceil(n) == Math.floor(n))
			return false;
		else if (n < 2)
			return false;
		else {
			for (int i = 2; i * i <= n; i++) {
				if (n % i == 0)
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//---------------------------------------------------------
		System.out.print("Nhap n = ");
		int n1 = scanner.nextInt();
		if (isPrime(n1))
			System.out.print(n1 + " la so nguyen to");
		else
			System.out.print(n1 + " ko phai so nguyen to");
//---------------------------------------------------------
		System.out.print("Nhap n = ");
		long n2 = scanner.nextLong();
		if (isPrime(n2))
			System.out.print(n1 + " la so nguyen to");
		else
			System.out.print(n1 + " ko phai so nguyen to");
//---------------------------------------------------------
		System.out.print("Nhap n = ");
		float n3 = scanner.nextFloat();
		if (isPrime(n3))
			System.out.print(n1 + " la so nguyen to");
		else
			System.out.print(n1 + " ko phai so nguyen to");
//---------------------------------------------------------
		System.out.print("Nhap n = ");
		double n4 = scanner.nextDouble();
		if (isPrime(n4))
			System.out.print(n1 + " la so nguyen to");
		else
			System.out.print(n1 + " ko phai so nguyen to");
	}
}
