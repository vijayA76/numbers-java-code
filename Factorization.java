import java.util.Scanner;

class Factorization {

	public static void main (String[] args) {
		
		int num,i;

		Scanner sc=new Scanner(System.in);

		System.out.print("\nEnter the number: ");
		num=sc.nextInt();
		System.out.print("Factorization of ("+num+") = 1");

		for(i=2;i<=num;i++)
		{
			if((num%i)==0)
			{					
				while(i<=num)
				{						
					System.out.print("x"+i);
					num=num/i;
					if(num%i!=0)
						{break;}
				}								
			}				
		}
		System.out.print("\n ");				
	}
}