package jsoft_4;

import java.util.Scanner;

public class manager {
	public static Scanner scanner = new Scanner(System.in);
	private String maQL;
	private String hoTen;

	public String getMaQL() {
		return maQL;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setMaQL(String maQL) {
		this.maQL = maQL;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

}
