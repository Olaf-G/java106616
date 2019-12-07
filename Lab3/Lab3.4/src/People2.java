import java.util.*;


public class People2 implements Comparable<People2>
{
	private String name;
	private String surname;
	private int age;
	public People2(String first, String second, int number)
	{
		this.setName(first);
		this.setSurname(second);
		this.setAge(number);
	}
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getSurname() { return surname; }
	public void setSurname(String surname) { this.surname = surname; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	public void getAll() { System.out.println(this.name + " " + this.surname + " " + this.age); }
	
	
	 public static void main(String[] args)
	 {
		 List<People2> spis = new ArrayList<People2>();
		 People2 adam = new People2("Adam", "Adamowiks", 41);
		 People2 kasia = new People2("Katarzyna", "Kowalska", 32);
		 People2 aleks = new People2("Aleks", "Nowak", 52);
		 spis.add(adam);
		 spis.add(kasia);
		 spis.add(aleks);
		 for(People2 tmp : spis)
		 {
			 tmp.getAll();
		 }
		 Collections.sort(spis);
		 for(People2 tmp : spis)
		 {
			 tmp.getAll();
		 }
	 }
	@Override
	public int compareTo(People2 arg0) {
		// TODO Auto-generated method stub
		if(this.getAge() == arg0.getAge())
		{ return 0; }
		else if (this.getAge() > arg0.getAge())
		{
			return 1;
		}
		else return -1;
		}
	}
