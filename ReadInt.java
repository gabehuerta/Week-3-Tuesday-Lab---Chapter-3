import java.util.Scanner;

public class ReadInt
{
    public static void main(String[] args)
    {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Please enter a number");
	System.out.println("I will tell you YES if your number is higher than 100 and or is in between 50 to 75");
	System.out.println("I will tell you NO if otherwise");
	int x = keyboard.nextInt( );

	if (x > 100) {
		System.out.println("YES");
	}
	else if (x >= 50 && x <= 75) {
		System.out.println("YES");
	} 
	else {
		System.out.println("NO");
	}
    }
}