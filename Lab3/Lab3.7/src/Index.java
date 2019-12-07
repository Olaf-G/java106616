public class Index 
{
	private String przedmiot;
	   private int number;
	   
	   public Index(int number, String przedmiot) 
	   {
	      this.number = number;
	      this.przedmiot = przedmiot;
	   }
	   
	   
	   public void TryToPass(int grade) throws MyException
	   {
	      if(grade <= number) {
	         number -= grade;
	      }else {
	         int needs = grade - number;
	         throw new MyException(needs);
	      }
	   }
	   
	   public int getGrade() {
	      return number;
	   }
	   
	   public String Przedmiot() {
	      return przedmiot;
	   }
	   
	   public void CheckPrzedmiot(String nazwa)
	   {
		   if(this.przedmiot != nazwa)
		   {
			   throw new MyRunException("To nie ten przedmiot");
		   }
	   }
	   
	   public static void main(String [] args)
	   {
		   Index student = new Index(2, "Java");
		   try
		   {
		   student.TryToPass(4);
		   } catch(MyException e)
		   {
			   System.out.println("Poprawka we wrzesniu");
		   }
		   student.CheckPrzedmiot("Fizyka");
		   
		   
}
}
