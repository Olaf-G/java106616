
public class Teacher extends UniversityPerson
{
	String przedmiot;
	public void get()
	{
		System.out.println(przedmiot);
	}
	public void setSubject(String nazwa)
	{
		przedmiot = nazwa;
	}
}
