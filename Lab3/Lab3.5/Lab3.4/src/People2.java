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
		HashSet<People2> spis = new HashSet<>();
		 People2 adam = new People2("Adam", "Adamowiks", 41);
		 People2 kasia = new People2("Katarzyna", "Kowalska", 32);
		 People2 aleks = new People2("Aleks", "Nowak", 52);
		 People2 clone = new People2("Aleks", "Nowak", 52);
		 spis.add(adam);
		 spis.add(kasia);
		 spis.add(aleks);
		 spis.add(clone);
		 for(People2 tmp : spis)
		 {
			 tmp.getAll();
		 }
		 //Dodaje siê, ale jest wyœwietlne na samym dole 
		 HashSet<People2> zapis = new HashSet<>();
		 People2 olaf = new People2("Adam", "Adamowiks", 41);
		 People2 ania = new People2("Katarzyna", "Kowalska", 32);
		 People2 olek = new People2("Aleks", "Nowak", 52);
		 People2 copy = new People2("Aleks", "Nowak", 52);
		 zapis.add(olaf);
		 zapis.add(ania);
		 zapis.add(olek);
		 zapis.add(copy);
		 int test = spis.hashCode();
		 int test2 = zapis.hashCode();
		 boolean value = spis.equals(zapis);
		 System.out.println(value + " " + (test == test2));
		 // false false
		 TreeSet<People2> tree = new TreeSet<People2>();
		 tree.add(adam);
		 tree.add(kasia);
		 tree.add(aleks);
		 tree.add(clone);
		 System.out.println(tree);
		 
	 }

	@Override
	public int compareTo(People2 o) 
	{
		// TODO Auto-generated method stub
		if (this.age == o.age)
		{
			return 0;
		}
		else if (this.age > o.age)
		{
			return 1;
		}
		else
			return -1;
	}

	}
