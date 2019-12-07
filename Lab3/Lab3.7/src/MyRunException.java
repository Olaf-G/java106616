
public class MyRunException extends RuntimeException
{
	private String przedmiot;
	
	public MyRunException(String przedmiot)
	{
		this.przedmiot = przedmiot;
	}
	
	public String getprzedmiot()
	{
		return this.przedmiot;
	}
}
