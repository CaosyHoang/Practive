package jsoft_1;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Sinh ngay: ");
		int ngay = input.nextInt();
		System.out.print("Sinh thang: ");
		int thang = input.nextInt();
		System.out.print(" ==> ");
		switch (thang) {
		case 1: {
			if (ngay >= 1 && ngay <= 19)
				System.out.print("Ma Ket");
			else
				System.out.print("Bao Binh");
			break;
		}
		case 2: {
			if (ngay >= 1 && ngay <= 18)
				System.out.print("Bao Binh");
			else
				System.out.print("Song Ngu");
			break;
		}

		case 3: {
			if (ngay >= 1 && ngay <= 20)
				System.out.print("Song Ngu");
			else
				System.out.print("Bach Duong");
			break;
		}
		case 4: {
			if (ngay >= 1 && ngay <= 20)
				System.out.print("Bach Duong");
			else
				System.out.print("Kim Nguu");
			break;
		}
		case 5: {
			if (ngay >= 1 && ngay <= 20)
				System.out.print("Kim Nguu");
			else
				System.out.print("Song Tu");
			break;
		}
		case 6: {
			if (ngay >= 1 && ngay <= 21)
				System.out.print("Song Tu");
			else
				System.out.print("Cu Giai");
			break;
		}
		case 7: {
			if (ngay >= 1 && ngay <= 22)
				System.out.print("Cu Giai");
			else
				System.out.print("Su Tu");
			break;
		}
		case 8: {
			if (ngay >= 1 && ngay <= 22)
				System.out.print("Su Tu");
			else
				System.out.print("Xu Nu");
			break;
		}
		case 9: {
			if (ngay >= 1 && ngay <= 22)
				System.out.print("xu Nu");
			else
				System.out.print("Thien Binh");
			break;
		}
		case 10: {
			if (ngay >= 1 && ngay <= 23)
				System.out.print("Thien Binh");
			else
				System.out.print("Bo Cap");
			break;
		}
		case 11: {
			if (ngay >= 1 && ngay <= 22)
				System.out.print("Bo Cap");
			else
				System.out.print("Nhan Ma");
			break;
		}
		case 12: {
			if (ngay >= 1 && ngay <= 21)
				System.out.print("Nhan Ma");
			else
				System.out.print("Ma Ket");
			break;
		}
		}
	}
}