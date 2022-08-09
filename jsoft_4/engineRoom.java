package jsoft_4;

import java.util.Scanner;

public class engineRoom {
	public static Scanner scanner = new Scanner(System.in);
	private String maPhong;
	private String tenPhong;
	private float dienTich;
	private manager quanLy = new manager();
	private machine may = new machine();

	public void input() {
		System.out.print("Nhap ma phong: ");
		maPhong = scanner.nextLine();
		System.out.print("Nhap ten phong: ");
		tenPhong = scanner.nextLine();
		System.out.print("Nhap dien tich: ");
		dienTich = scanner.nextFloat();
		scanner.nextLine();
		System.out.print("Nhap ma quan ly: ");
		quanLy.setMaQL(scanner.nextLine());
		System.out.print("Nhap ho ten: ");
		quanLy.setHoTen(scanner.nextLine());
		System.out.print("Nhap ma may: ");
		may.setMaMay(scanner.nextLine());
		System.out.print("Nhap kieu may: ");
		may.setKieuMay(scanner.nextLine());
		System.out.print("Nhap tinh trang: ");
		may.setTinhTrang(scanner.nextLine());
	}

	public void output() {
		System.out.println(" Ma phong = " + maPhong);
		System.out.println(" Ten phong = " + tenPhong);
		System.out.println(" Dien tich = " + dienTich);
		System.out.println(" Ma quan ly = " + quanLy.getMaQL());
		System.out.println(" Ho ten = " + quanLy.getHoTen());
		System.out.println(" Ma may = " + may.getMaMay());
		System.out.println(" Kieu may = " + may.getKieuMay());
		System.out.println(" Tinh Trang = " + may.getTinhTrang());
	}

	public static void main(String[] args) {
		engineRoom phongMay = new engineRoom();
		System.out.println("Nhap Thong tin phong hoc:");
		phongMay.input();
		System.out.println("In ra thong tin:");
		phongMay.output();

	}
}
