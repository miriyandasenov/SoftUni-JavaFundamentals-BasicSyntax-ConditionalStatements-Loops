import java.util.Scanner;

public class Lab11 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		

		int n = Integer.parseInt(sc.nextLine());

		int multiplier = Integer.parseInt(sc.nextLine());

		if(multiplier < 11){

			for(int i = multiplier; i < 11; i++){
				int res = n*i;
				System.out.println(n + " X " + i + " = " + res);
			}
		}else{
			int res = n*multiplier;
			System.out.println(n + " X " + multiplier + " = " + res);
		}		 	 
	}
}