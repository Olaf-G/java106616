
abstract class Car 
{
	String model;
	abstract void run();
	void setModel(String name)
	{
		model = name;
	}
	void getModel()
	{
		System.out.println(model);
	}
}
