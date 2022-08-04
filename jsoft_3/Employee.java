package jsoft_3;

import java.util.Scanner;

public class Employee {
	public static Scanner scanner = new Scanner(System.in);
	public static int PRICE = 50;
	private String id;
	private String name;
	private int age;
	private int workingDays;
	private double salary = workingDays * PRICE;

	public Employee() {
		id = "Null";
		name = "Null";
		age = 0;
		workingDays = 0;
	}

	public void input() {
		System.out.print("Nhap ma nhan vien: ");
		id = scanner.nextLine();
		System.out.print("Nhap ho ten: ");
		name = scanner.nextLine();
		System.out.print("Nhap tuoi: ");
		age = scanner.nextInt();
		System.out.print("Nhap so ngay cong: ");
		workingDays = scanner.nextInt();
	}

	public void output() {
		System.out.println("\n------------Thong so--------------");
		System.out.println("Ma nhan vien: " + id);
		System.out.println("Ho ten: " + name);
		System.out.println("Tuoi: " + age);
		System.out.println("So ngay cong: " + workingDays);
		System.out.println("Tien cong: " + Salary());
	}

	public double Salary() {
		return workingDays * PRICE;
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public int getWorkingDays() {
		return this.workingDays;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}

	public static void main(String[] args) {
		Employee worker = new Employee();
		worker.input();
		worker.output();
	}

}
