package jsoft_3;

import java.util.Scanner;

public class HinhChuNhat {
	public static Scanner scanner = new Scanner(System.in);
	private int height;
	private int width;

	public int getHeight() {
		return this.height;
	}

	public int getWidth() {
		return this.width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void input() {
		System.out.print("Height = ");
		height = scanner.nextInt();
		System.out.print("Width = ");
		width = scanner.nextInt();
	}

	public int area() {

		return height * width;
	}

	public int perimeter() {

		return (height + width) * 2;
	}

	public static void main(String[] args) {
		HinhChuNhat hcn_a = new HinhChuNhat();
		HinhChuNhat hcn_b = new HinhChuNhat();
//	cach1:
		System.out.println("Nhap cho hcn A:");
		hcn_a.input();
		System.out.println("Nhap cho hcn B:");
		hcn_b.input();
//	cach2:
//		System.out.print("Nhap cho hcn A:\nHeight = ");
//		hcn_a.setHeight(scanner.nextInt());
//		System.out.print("width = ");
//		hcn_a.setWidth(scanner.nextInt());
//		System.out.print("Nhap cho hcn B:\nHeight = ");
//		hcn_b.setHeight(scanner.nextInt());
//		System.out.print("width = ");
//		hcn_b.setWidth(scanner.nextInt());
		System.out.println("-------------Thong so-------------");
		int area_a = hcn_a.area();
		int area_b = hcn_b.area();
		System.out.println("Hinh a:\nChieu dai = " + hcn_a.height + "\nChieu rong = " + hcn_a.width);
		System.out.println("Dien tich = " + area_a);
		System.out.println("Chu vi = " + hcn_a.perimeter());
		System.out.println("Hinh b:\nChieu dai = " + hcn_b.height + "\nChieu rong = " + hcn_b.width);
		System.out.println("Dien tich  = " + area_b);
		System.out.println("Chu vi hcn_b = " + hcn_b.perimeter());
		if (area_a > area_b)
			System.out.println("Dien tich hinh a > dien tich hinh b");
		else
			System.out.println("Dien tich hinh a < dien tich hinh b");

	}
}
