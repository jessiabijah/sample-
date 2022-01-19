package sample;

public class SampleDivupToRemZero {

	public static void main(String[] args) {
		String rev;
		int reversed = 0;
		int i = 35;/// 1,0,0,0,1,1
		String remainder = "";
		int quotient = 0;
		boolean loop = true;
		while (loop) {
			System.out.println(i + "   " + i%2);
			remainder = i % 2 + remainder; //00011
			i = i / 2;
			if (i < 1) {
				loop = false;
			}

		}
		System.out.println(remainder);

	}
}
