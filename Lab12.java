import java.lang.Math;
import java.util.Scanner;

public class Lab12 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		

		int n = Integer.parseInt(sc.nextLine());

		while(n%2 != 0){


			System.out.println("Please write an even number.");
			n = Integer.parseInt(sc.nextLine());
		} 

		System.out.println("The number is: " + Math.abs(n));
		 	 
	}
}