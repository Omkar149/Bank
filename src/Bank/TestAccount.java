package Bank;

import java.util.Scanner;


public class TestAccount 
{
	static Scanner sc=new Scanner(System.in);

	public static void main(String args[])
	{
		Account a=new Account();
		//Account arr[]=accept();
		//	display(arr);
		int ch;
		System.out.println("1.Saving \t2.current\t3.Demat");
		ch=sc.nextInt();
		System.out.println("Enter acc no,custname,balance and pan no");
		a.setAccno(sc.nextInt());
		a.setCustname(sc.next());
		a.setBalance(sc.nextInt());
		a.setPan(sc.next());
		System.out.println(a);
		switch(ch)
		{
		case 1:
			Saving s=new Saving();
			accept(s);
			System.out.println("Do you want to take loan");
			System.out.println("1.loan \t2.exit");
			int choice=sc.nextInt();
			System.out.println(s);
			switch(choice)
			{
			case 1:
				Loan l=new Loan();
				accept(l);
				System.out.println("1.home loan \t2.car Loan \t3.exit");
				int ch1=sc.nextInt();
				System.out.println(l);
				switch(ch1)
				{
				case 1:
					HomeLoan h=new HomeLoan();
					accept(h);
					System.out.println("Enter area,amount,no of year and rate of interest");
					h.setArea(sc.nextDouble());
					h.setAmount(sc.nextInt());
					h.setYear(sc.nextInt());
					h.setInterest(sc.nextDouble());
					System.out.println(h);
					break;

				case 2:
					CarLoan c1=new CarLoan();
					accept(c1);
					System.out.println("Enter area,amount,no of year and rate of interest");
					c1.setCarType(sc.next());
					c1.setAmount(sc.nextInt());
					c1.setYear(sc.nextInt());
					c1.setInterest(sc.nextDouble());
					System.out.println(c1);
					break;

				case 3:
					return;
				}
			case 2:
				return;
			}

		case 2:
			Current c=new Current();
			accept(c);
			System.out.println(c);
			break;
		case 3:
			Demat d=new Demat();
			accept(d);
			System.out.println(d);
			break;
		}
	}
	public static void accept(Account a)
	{
		/*
		Account arr[]=new Account[6];
		arr[0]=new Saving(1,"abc",2000,25000,6);
		arr[1]=new Current(1,"pqr",3000,"abc","a123");
		arr[2]=new Loan(1,"pqr",3000,1,);
		arr[3]=new Demat(1,"pqr",3000,);
		arr[4]=new CarLoan(1,"pqr",3000,);
		arr[5]=new HomeLoan();

		return arr;
		 */

	
		if(a instanceof Saving)
		{
			System.out.println("Enter amtlimit and tlimit ");
			s.setTlimit(sc.nextInt());
			s.setAmtlimit(sc.nextInt());
			System.out.println(s);
		}
		if(a instanceof Current)
		{
			System.out.println("Enter company name and Gst no:");
			Current c=(Current)a;
			c.setCompanyname(sc.next());
			c.setGstNo(sc.next());
			System.out.println(c);
		}
		if(a instanceof Demat)
		{
			System.out.println("Enter share id,name and price");
			Demat d=(Demat)a;
			d.setShareid(sc.nextInt());
			d.setSharename(sc.next());
			d.setSharesprice(sc.nextInt());
		}

	}

public void display()
{
	System.out.println();
	
}

	/*public static void display(Account arr[])
	{
		for(Account a:arr)
		{
		System.out.println(a);
		}
	}
	 */
}
