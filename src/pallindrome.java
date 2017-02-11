import java.util.Scanner;
public class pallindrome {
	public static void main(String[] args)
	{
		int n,temp,p=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		n=s.nextInt();temp=n;
		while(n!=0)
		{
			p=p*10+n%10;
			n/=10;
		}
		if(p==temp)
			System.out.println("number is pallindrome");
		else
			System.out.println("not pallindrome");
		
		
	}

}
