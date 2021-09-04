package Week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstNum1 = 0;
		int secNum2 = 1;
		int range = 8;
int sum;
System.out.println(firstNum1 + "\n" + secNum2);
for (int i = 1; i < 8; i++) {
	sum = firstNum1 + secNum2;
	firstNum1 = secNum2;
	secNum2 = sum;
	System.out.println(sum);
}
	}
}
