
public class Student extends UniversityPerson
{
	int rok;
	int stopien;
	String kierunek;
	Student(){}
	Student(int a, int b, String uczelnia)
	{
		rok = a;
		stopien = b;
		kierunek = uczelnia;
	}
	void getRok()
	{
		System.out.println(rok);
	}
	void setRok(int a)
	{
		rok = a;
	}
	void getStopien()
	{
		System.out.println(stopien);
	}
	void setSubject(int a)
	{
		stopien = a;
	}
	void getKierunek()
	{
		System.out.println(kierunek);
	}
	void setKierunek(String nazwa)
	{
		kierunek = nazwa;
	}
	
}
