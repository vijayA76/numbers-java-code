// ...... find factor of a number ex  .......

import java.util.Scanner;

// ...... find factors of a number ex - factor of 12: 1, 2, 3, 4, 6, 12 .......

class Factor {

	public static void main (String[] args) {
		
		int num,len,i;

		Scanner sc=new Scanner(System.in);
		
		System.out.print("\nEnter the number: ");
		num=sc.nextInt();
		System.out.print("\nFactors of ("+num+") = ");

		len=(num/2)+1;
		for(i=1;i<len;i++)
		{
			if((num%i)==0)
			{
				System.out.print(i+",");
			}				
		}
		System.out.print(num+"\n ");				
	}
}