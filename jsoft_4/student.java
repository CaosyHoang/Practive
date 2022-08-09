package jsoft_4;

import java.util.Scanner;

public class student {
	public static Scanner scanner = new Scanner(System.in);
	private String maSo;
	private String name;
	private int age;
	private address diaChi = new address();

	public void input() {
		System.out.print("Nhap ma so: ");
		maSo = scanner.nextLine();
		System.out.print("Nhap ten: ");
		name = scanner.nextLine();
		System.out.print("Nhap tuoi: ");
		age = scanner.nextInt();
		scanner.nextLine();
		diaChi.input();
	}

	public void output() {
		System.out.println(" Ma so = " + maSo);
		System.out.println(" Ten = " + name);
		System.out.println(" Tuoi = " + age);
		diaChi.output();
	}

	public static int find(student sinhVien[], String id) {
		int index = -1;
		for (int i = 0; i < sinhVien.length; i++) {
			if (sinhVien[i].maSo.compareToIgnoreCase(id) == 0) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static void fix(student sinhVien[]) {
		for (int i = 0; i < sinhVien.length; i++) {
			if (sinhVien[i].diaChi.getProvince().compareToIgnoreCase("Thanh Hoa") == 0) {
				sinhVien[i].diaChi.setProvince("Hai Phong");
			}
		}
	}

	public static void delete(student sinhVien[], String id) {
		for (int i = 0; i < sinhVien.length; i++) {
			if (sinhVien[i].maSo.compareToIgnoreCase(id) == 0) {
				for (int j = i; j < sinhVien.length - 1; j++) {
					sinhVien[j] = sinhVien[j + 1];
				}
				break;
			}
		}
	}

	public static void main(String[] args) {
		System.out.print("Nhap n = ");
		int n = scanner.nextInt();
		scanner.nextLine();
		student sinhVien[] = new student[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap sinh vien " + (i + 1));
			sinhVien[i] = new student();
			sinhVien[i].input();
		}
		System.out.println("-----------------------------");
		for (int i = 0; i < n; i++) {
			System.out.println("In sinh vien " + (i + 1));
			sinhVien[i].output();
		}
		System.out.print("Nhap ma so can tim: ");
		String id = scanner.nextLine();
		int index = find(sinhVien, id);

		if (index != -1) {
			System.out.println("Day la sinh vien ban dang tim:");
			sinhVien[index].output();
		} else {
			System.out.println("Khong co du lieu sinh vien !!");
		}
		fix(sinhVien);
		System.out.println("-----------------------------");
		for (int i = 0; i < n; i++) {
			System.out.println("In sinh vien " + (i + 1));
			sinhVien[i].output();
		}
		System.out.print("Nhap ma so can xoa: ");
		id = scanner.nextLine();
		delete(sinhVien, id);
		n--;
		System.out.println("-----------------------------");
		for (int i = 0; i < n; i++) {
			System.out.println("In sinh vien " + (i + 1));
			sinhVien[i].output();
		}
	}
}
