import java.util.Scanner;

public class Lab10 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		

		int n = Integer.parseInt(sc.nextLine());

		for(int i = 1; i < 11; i++){
			int m = n*i;
			System.out.println(n + " X " + i + " = " + m);
		}	 	 
	}
}