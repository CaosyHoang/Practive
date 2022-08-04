package jsoft_3;

import java.util.Scanner;

public class NhanVien {
	public static Scanner scanner = new Scanner(System.in);
	private int code;
	private String name;
	private int age;
	private String address;
	private String function;
	private static int nextCode = 1;

	public NhanVien() {
		code = nextCode;
		nextCode++;
	}

	public void input() {
		System.out.print("Nhap ten nhan vien: ");
		name = scanner.nextLine();
		System.out.print("Nhap tuoi: ");
		age = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Nhap dia chi: ");
		address = scanner.next();
		scanner.nextLine();
		System.out.print("Nhap bo phan: ");
		function = scanner.nextLine();
	}

	public void output() {
		System.out.printf("%-10d%-10s%-10d%-10s%-10s\n", code, name, age, address, function);
	}

	public static void main(String[] args) {
		System.out.print("Nhap n = ");
		int n = scanner.nextInt();
		scanner.nextLine();
		NhanVien staff[] = new NhanVien[n];
		for (int i = 0; i < n; i++) {
			System.out.println("\nNhan vien " + (i + 1));
			staff[i] = new NhanVien();
			staff[i].input();
		}

		System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Manv", "Tensv", "Tuoi", "DiaChi", "BoPhan");
		for (int i = 0; i < n; i++) {
			staff[i].output();
		}

	}

}
