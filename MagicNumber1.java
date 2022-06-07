
import java.util.Scanner;
public class MagicNumber1
{
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No");
		int num=sc.nextInt();
		int sum=0;
		int copy=num;

		while(num>9)
		{
			while(num>0)
			{
				int mod=num%10;
				sum=sum+mod;
				num=num/10;
			}
				num=sum;
				sum=0;
		}
			if(num==1)
			{
				System.out.println("Magic no : "+copy);
			}
			else 
			{
				System.out.println("Not a magic no : "+copy);
		    }
	}
}
