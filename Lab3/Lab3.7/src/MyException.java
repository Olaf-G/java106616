

public class MyException extends Exception
{
	private int grade;
	
	public MyException(int currentGrade)
	{
		this.grade = currentGrade;
	}
	
	public int getGrade()
	{
		return this.grade;
	}
}
