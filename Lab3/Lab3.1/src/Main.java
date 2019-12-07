
public class Main <T, L>
{
	public boolean contains(T array[], T item)
	{
		
		for(T tmp : array)
		{
			if(tmp == item)
			{
				return true;
			}
			else
			{}
		}
		return false;
	}



public static void main(String[] args) {
    String[] array = {"element", "item"};
    String element1 = "element";
    String element2 = "element2";
    
    Main main = new Main();
    System.out.println(main.contains(array, element1));
    System.out.println(main.contains(array, element2));
}}