import java.util.Scanner;

class SimpleInterest
{
	public static void main (String args[])
	
	{
		
		
	int p,r,t,i,si;
	
	for (i=1;i<=5; i++)
		
	{
		
		System.out.println("Enter the Number");
		Scanner s =new Scanner (System.in);
		
		p=s.nextInt();
		r=s.nextInt();
		t=s.nextInt();
		
		
		si=p*r*t/100;
		
		System.out.println("Simple Interest is" +si);
		
	}	
	}		
	}
	
	

