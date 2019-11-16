
public class Figure implements NumberOfSidesPrintable
{
	int sides;
	void setSides(int ustaw)
	{
		sides = ustaw;
	}
	public void printSides()
	{
		System.out.println(sides);
	}
}
