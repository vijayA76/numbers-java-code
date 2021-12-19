// ...... find prime numbers in given range .......

import java.util.Scanner;

class Prime {

	public static void main(String[] args) {

		int R1,R2,num,count,d,i,l;
		Scanner sc=new Scanner (System.in);

		System.out.print("Enter the first range:");
		R1=sc.nextInt();
		System.out.print("Enter the second range:");
		R2=sc.nextInt();

		for(num=R1;num<R2;num++)
		{
			d=num-((num/10)*10);
			l=num;
			if(l==2 || l==5 || d==1 || d==3 || d==7 || d==9)
			{

				count=0;
				for(i=3;i<num;i+=2)
				{
					if(num%i==0)
					{
						count++;
						break;
					}
				}
				if(count==0 && num!=1)
					{System.out.println(num);}
			}		
		}
	}
}

			