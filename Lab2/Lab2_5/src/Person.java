
public abstract class Person {
	int age;
	String race;
	String job;
	Person(){}
	Person(String rasa, String praca, int wiek)
	{
		age = wiek;
		race = rasa;
		job = praca;
	}
	  void setAge(int wiek)
	{
		age = wiek;
	}
	 void setRace(String rasa)
	{
	  race = rasa;
	}
	 void setJob(String praca)
	 {
		 job = praca;
	 }
	 void getAge()
	{
	  System.out.println(age);
	}
	 void getAll()
	 {
		 System.out.println(age);
		 System.out.println(race);
		 System.out.println(job);
	 }
	
}
