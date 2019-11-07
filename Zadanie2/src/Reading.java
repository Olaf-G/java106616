import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class Reading {
	void IntoArray(String[] data) throws Exception {
	File file = new File(".sr\\Pytania.txt");
	BufferedReader abc = new BufferedReader(new FileReader(file));
	List<String> lines = new ArrayList<String>();
	String line;
	while((line = abc.readLine()) != null) {
	    lines.add(line);
	}
	abc.close();
	data = lines.toArray(new String[]{});
	}
	
	void ShowQuestion(int numer, String[] data) 
	{
		int j = (numer - 1)*6;
		for (int i = j; i < j+5; i++) 
		{
			 System.out.println(data[i]);
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		String[] pytania = new String[30];
		Reading nowy = new Reading();
		Scanner sc = new Scanner(System.in);
		nowy.IntoArray(pytania);
		for(int i = 0; i < 4; i++)
		{
			nowy.ShowQuestion(i, pytania);
			char odpowiedz = sc.next().charAt(0);
			if(i == 0)
			{
			 System.out.println(pytania[5]);
			}
			else
			{
				System.out.println(pytania[(i*6)-1]);
			}
		}
		
	}

}

