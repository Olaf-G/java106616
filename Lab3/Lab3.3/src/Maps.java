import java.util.HashMap;
import java.util.Map;

public class Maps 
{
	public static void main(String[] args)
	{
		Map<Double, String> map = new HashMap<Double, String>();
		map.put(11111111111., "Michal");
		map.put(12345125166., "Ania");
		System.out.println(map.get(11111111111.));
	}
}

