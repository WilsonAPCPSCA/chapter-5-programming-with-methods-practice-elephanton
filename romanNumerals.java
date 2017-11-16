import java.util.Scanner;
public class romanNumerals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter an integer from 1 to 100, enter 0 to quit: ");
		int n;
		String one = "I";
		String five = "V";
		String ten = "X";
		do{
			n = in.nextInt();
			System.out.println(romanDigit(n, one, five, ten));
		}
		while(n != 0);
	}
	public static String romanDigit(int n, String one, String five, String ten){
		String x = "";
		ones(n);
		fives(n);
		tens(n);
		fifty(n);
		hundred(n);
		one = "I";
		five = "V";
		ten = "X";
		return x;
	}
	public static void ones(int n){
		String one = "I";
		if (n > 0 && n <= 3){
			for (int i = 0; i < n; i++){
				System.out.print(one);
			}
		}
		else if (n == 4){
			System.out.print("IV");
		}
	}
	public static void fives(int n){
		String five = "V";
		int m = 0;
		if (n > 4 && n <= 8){
			System.out.print(five);
			m = n%5;
			ones(m);
		}
		else if (n == 9){
			System.out.print("IX");
		}
	}
	public static void tens(int n){
		String ten = "X";
		int m = 0;
		if (n >= 10 && n < 40){
			m = n/10;
			for(int i = 0; i < m; i++){
					System.out.print(ten);
			}
			if (n%10 != 0){
				n = n%10;
				ones(n);
				fives(n);
			}
		}
	}
	public static void fifty(int n){
		String fifty = "L";
		int m = 0;
		if (n >= 40 && n < 50){
			m = n%10;
			System.out.print("X" + fifty);
			ones(m);
			fives(m);
		}
		else if(n >= 50 && n < 90){
			m = n-50;
			System.out.print(fifty);
			ones(m);
			fives(m);
			tens(m);
		}
	}
	public static void hundred(int n){
		String hundred = "C";
		int m = 0;
		if (n >= 90 && n < 100){
			m = n%90;
			System.out.print("X" + hundred);
			ones(m);
			fives(m);
		}
		else if (n == 100){
			System.out.print(hundred);
		}
	}
}