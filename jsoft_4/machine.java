package jsoft_4;

import java.util.Scanner;

public class machine {
	public static Scanner scanner = new Scanner(System.in);
	private String maMay;
	private String kieuMay;
	private String tinhTrang;

	public String getMaMay() {
		return maMay;
	}

	public String getKieuMay() {
		return kieuMay;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setMaMay(String maMay) {
		this.maMay = maMay;
	}

	public void setKieuMay(String kieuMay) {
		this.kieuMay = kieuMay;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

}
