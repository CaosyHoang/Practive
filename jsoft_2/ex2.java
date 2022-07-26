package jsoft_2;

public class ex2 {
	public static String fomartString(String str) {
		String chs[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		for (String ch : chs) {
			str = str.replace(ch, "");
		}
		str = str.trim();
		while (str.indexOf("  ") != -1) {
			str = str.replace("  ", " ");
		}
		String subStr[] = str.split(" ");
		str = "";
		for (int i = 0; i < subStr.length; i++) {
			String subStart = subStr[i].substring(0, 1).toUpperCase();
			String subEnd = subStr[i].substring(1).toLowerCase();
			if (i < subStr.length - 1) {
				str += subStart + subEnd + " ";
			} else {
				str += subStart + subEnd;
			}
		}
		return str;
	}

	public static void main(String[] args) {
		String str = "    c3a5o  s6y   m8i0n0h    H07o2a1ng111   ";
		str = fomartString(str);
		System.out.println(str);

	}
}
