import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int fact=1;
		while(t-->0)
		{
			int n=sc.nextInt();
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
				
					//System.out.println(fact);
			
			
		}
			
			System.out.println(fact);
	}

	}
}
