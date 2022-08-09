package jsoft_4;

import java.util.Scanner;

public class address {
	public static Scanner scanner = new Scanner(System.in);
	private String id;
	private String district;
	private String province;

	public void input() {
		System.out.print("Nhap id: ");
		id = scanner.nextLine();
		System.out.print("Nhap quan: ");
		district = scanner.nextLine();
		System.out.print("Nhap tinh: ");
		province = scanner.nextLine();
	}

	public String getId() {
		return id;
	}

	public String getDistrict() {
		return district;
	}

	public String getProvince() {
		return province;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public void output() {
		System.out.println(" Id = " + id);
		System.out.println(" Quan = " + district);
		System.out.println(" Tinh = " + province);
	}
}
