package sample;

public class Samplenum {
	public static void main(String[] args) {
		String rev;
		int reversed = 0;
		int i = 35;
		int d = i / 2;
		System.out.println((d % 2));
		int d1 = d / 2; // 17%2
		System.out.print(d % 2);
		int d2 = d1 / 2; // 8%2
		System.out.print(d1 % 2);
		int d3 = d2 / 2; // 4%2
		System.out.print(d2 % 2);
		int d4 = d3 / 2; // 2%2
		System.out.print(d3 % 2);
		int d5 = d4 / 2;
		System.out.print(d4 % 2);
		rev = "110001";
		for (int j = rev.length() - 1; j >= 0; j--) {
			reversed = reversed + rev.charAt(j);
			System.out.print( rev.charAt(j));
		}

	}
}