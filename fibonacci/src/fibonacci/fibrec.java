package fibonacci;

public class fibrec {

	public static int fib(int n) {
		System.out.println("in reg " + n);
		if ((n == 0) || (n == 1)) {
			System.out.println("in zero or one " + n);
			return n;
		} else {
			System.out.println("in else " + n);
			int first = fib(n - 1);
			System.out.println("first " + first );
			System.out.println("==========================");
			int second = fib(n - 2);
			System.out.println("Second " + second);
			return first + second;// 3=> 2, 1
		}

	}

	public static void main(String args[]) {
		int maxNumber = 10;
		for (int i = 0; i < maxNumber; i++) {
			System.out.println("start ");
			System.out.println(fib(i) + " ");
			System.out.println("end ");
		}
	}

}
