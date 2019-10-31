import java.util.Scanner;

public class DivisibleX
{
    public static void main(String[] args)
    {
	Scanner keyboard = new Scanner(System.in);

	System.out.println("Enter two numbers and I will tell you whether your first number is divisible by the second with a remainder of 0");
	System.out.println("Please enter the first number");
	int x = keyboard.nextInt( );
	System.out.println("Please enter the second number");
	int y = keyboard.nextInt( );
	
	if (x % y == 0) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}
    }
}
	