
public class Account
{
	class Bank
	{
	double state;
	Bank(double a)
	{
		this.state = a;
	}
	public synchronized double getMoney()
	{
		return this.state;
	}
	public synchronized void withdrawState(double amount)
	{
		this.state = this.state - amount;
	}
	public Bank getThis()
	{
		return this;
	}}
	
	class Controller extends Thread {
		Bank bank;
		Controller(Bank account)
		{
			this.bank = account;
		}
	public void run()
	{
		System.out.println(bank.getMoney());
		boolean withdraw;
		if(bank.state >= 1000)
		{
			withdraw = true;
		}
		else
		{
			withdraw = false;
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(withdraw == true )
		{
			bank.withdrawState(1000);
			System.out.println(bank.getMoney());
		}
	}}
	
	public static void main(String[] args)
	{
		Bank account = new Bank(2137);
		new Thread(new Controller(account)).start();
		new Thread(new Controller(account)).start();
		new Thread(new Controller(account)).start();
	}
	
}}
