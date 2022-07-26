package jsoft_2;

import java.util.Scanner;
import java.math.*;

public class ex1 {
	public static void scannerArray(int arr[]) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] = ");
			arr[i] = input.nextInt();
		}
	}

	public static void print(int arr[]) {
		System.out.println("\nHien thi mang:");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static float average(int arr[]) {
		int tbc = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0 && (i + 1) % 2 == 0) {
				tbc += arr[i];
				count++;
			}
		}
		return tbc;
	}

	public static int valueMin(int arr[]) {
		int min = arr[0];
		int place = 1;
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				place = i + 1;
			}
		}
		return place;
	}

	public static boolean checkScp(int x) {
		int qrt = (int) Math.sqrt(x);
		if (qrt * qrt == x) {
			return true;
		}
		return false;
	}

	public static void scp(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (checkScp(arr[i])) {
				System.out.println("Mang co so chinh phuong");
				break;
			} else {
				System.out.println("Mang khong co so chinh phuong");
			}
		}
	}

	public static boolean checkPrime(int x) {
		if (x < 2) {
			return false;
		} else {
			for (int i = 2; i * i <= x; i++) {
				if (x % i == 0)
					return false;
			}
		}
		return true;
	}
	
	public static void prime(int arr[]) {
		int count = 0;
		System.out.print("Cac so nguyen to co trong mang: ");
		for (int i = 0; i < arr.length; i++) {
			if (checkPrime(arr[i])) {
				count++;
				System.out.print(arr[i] + " ");
			}
		}
		if (count == 0) {
			System.out.print("null");
		}
	}

	public static int[] insertSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int cache = arr[i];
			int j = i - 1;
			while (j > -1 && cache < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = cache;
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap n = ");
		int n = input.nextInt();
		int arr[] = new int[n];
		scannerArray(arr);
		System.out.println("Trung binh cong = " + average(arr));
		System.out.println("Vi tri min: " + valueMin(arr));
		scp(arr);
		prime(arr);
		print(insertSort(arr));
	}
}
