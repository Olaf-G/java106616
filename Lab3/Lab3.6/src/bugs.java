
public class bugs 
{
	 public static void main(String[] args)
	 {
		 //1
		 //Integer name = null;
		 //name = name + 2;
		 //char[] matrix = new char[] {'H', 'e', 'l', 'l', 'o'};
		 //for(int i = 0; i <= matrix.length; ++i) 
		 //{
             //System.out.println(matrix[i]);
        //}
		 
		 //2
		/* try
		 {
		 char[] matrix = new char[] {'H', 'e', 'l', 'l', 'o'};
		 for(int i = 0; i <= matrix.length; ++i) 
		 {
             System.out.println(matrix[i]);
		 }
		 } catch (Exception ex)
		 {
			 System.out.println("Error");
		 }
		 System.out.println("No errors catched"); */
		 
		 //3
		 try
		 {
		 char[] matrix = new char[] {'H', 'e', 'l', 'l', 'o'};
		 for(int i = 0; i <= matrix.length; ++i) 
		 {
             System.out.println(matrix[i]);
		 }
		 } catch (Exception ex)
		 {
			 System.out.println("Error");
		 }
		 System.out.println("No errors catched");
}}
