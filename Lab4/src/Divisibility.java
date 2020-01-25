
public class Divisibility extends Thread
{
	int start;
	int end;
	Divisibility(int a, int b)
	{
		this.start = a;
		this.end = b;
	}
	public void run()
	{
		for(int i = this.start; i <= this.end; i++ )
		{
			if(i%3==0)
			{
				System.out.println(i);
			}
			else
			{
				if(i%5==0)
				{
					System.out.println(i);
				}
			}
		}
	}
	public static void main(String[] args)
	{
		Divisibility a = new Divisibility(0,100);
		Divisibility b = new Divisibility(101,200);
		Divisibility c = new Divisibility(201,300);
		Divisibility d = new Divisibility(301,400);
		Divisibility e = new Divisibility(401,500);
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}
}
