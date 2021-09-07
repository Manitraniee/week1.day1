
public class palidrome {

	public static void main(String[] args) {
		int num= 434;
		int temp = num;
int sum =0 ;
int n;
while (num >0) {
	n=num%10;
	sum=(sum*10)+n;
	num=num/10;
	}
	if (temp == sum) {
		System.out.println("this is palidrome number");
	}else {
		System.out.println("this number is not palidrome");
	}
	}
}

