import java.util.Scanner;

public class StrEnd 
{
	public static void main(String[] args) 
	{
		String input = "";
		String lastThree = "";
		Scanner scan = new Scanner(System.in);
		boolean doit = false;
		while(doit == false)
		{
			input = scan.nextLine();
			if(input.length() >= 3)
			{
				lastThree = input.substring(input.length() - 3);
			}
			else if(lastThree == "end")
			{
				doit = true;
				break;
			}
			else
			{
				System.out.println(doit);
			}
		}
	}
}
