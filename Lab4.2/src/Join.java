
public class Join extends Thread 
{
		int start;
		int end;
		
		public void run()
		{
			
			for(int i = 1; i <= 20; i++ )
			{
				System.out.println(i);
			}
				
		}
		public static void main(String[] args)
		{
			for(int i = 0; i < 10; i++)
			{
				Join a = new Join();
				a.start();
				try {
					a.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
