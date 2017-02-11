import java.util.Scanner;
public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int n,temp,arm=0,a;
			Scanner s=new Scanner(System.in);
			System.out.println("enter a number");
			n=s.nextInt();
			temp=n;
			while(n!=0)
			{
				a=n%10;
				arm+=a*a*a;
				n/=10;
			}
			if(arm==temp)
			{
				System.out.println("number is armstrong");
			}
			else
				System.out.println("number is not armstrong");
				
			
		

	}

}
