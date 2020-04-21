import java.util.Scanner;

public class Lab4 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		

		int hours = Integer.parseInt(sc.nextLine());

		int minutes = Integer.parseInt(sc.nextLine());

		if(minutes < 30){
			minutes = minutes + 30;
			 
			System.out.println(hours + ":" + minutes);

		}else{
			if(hours<23)hours++;
			else hours = 0;

			minutes -= 30;

			if( minutes >=0 && minutes < 10 ){
				System.out.println(hours + ":0" + minutes);
			}else{
				System.out.println(hours + ":" + minutes);
			}
		}
	}
}
