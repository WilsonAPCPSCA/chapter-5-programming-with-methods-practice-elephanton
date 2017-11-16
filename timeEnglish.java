//Elton Tran & Michael Pfeiffer
import java.util.Scanner;
public class timeEnglish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter an hour of the day: ");
		int hours = in.nextInt();
		System.out.println("Please enter minutes of the day: ");
		int minutes = in.nextInt();
		System.out.print(getTimeName(hours, minutes));
	}
	public static String getTimeName(int hours, int minutes){
		String x = "";
		String hour = "one";
		if(hours == 1){
			hour = "one";
		}
		else if(hours == 2){
			hour = "two";
		}
		else if(hours == 3){
			hour = "three";
		}
		else if(hours == 4){
			hour = "four";
		}
		else if(hours == 5){
			hour = "five";
		}
		else if(hours == 6){
			hour = "six";
		}
		else if(hours == 7){
			hour = "seven";
		}
		else if(hours == 8){
			hour = "eight";
		}
		else if(hours == 9){
			hour = "nine";
		}
		else if(hours == 10){
			hour = "ten";
		}
		else if(hours == 11){
			hour = "eleven";
		}
		else if(hours == 12){
			hour = "twelve";
		}
		if (minutes%15 != 0){
			x = (minutes + " minutes past " + hour);
		}
		else if (minutes%15 == 0){
			if (minutes == 15){
				x = ("quarter past " + hour);
			}
			else if (minutes == 30){
				x = ("half past " + hour);
			}
			else if (minutes == 45){
				x = ("quarter til " + hour);
			}
			else if (minutes == 0){
				x = (hour + " o' clock");
			}
		}
		return x;
	}

}
