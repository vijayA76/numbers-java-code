// ...... find perfectsquare numbers in given range .......

import java.util.Scanner;

class PerfectSquare {

	public static void main (String[] args) {

		int R1,R2,num,count,result,l,d,i;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\nEnter your first range: ");
		R1=sc.nextInt();

		System.out.print("\nEnter your second range: ");
		R2=sc.nextInt();

		for(num=R1;num<R2;num++)
		{									
			d=num-((num/10)*10);
			count=0;
			if(d!=2 || d!=3 || d!=7 || d!=8)
			{								
				if(num%4==0 || num%4==1)
				{								
					if(d==1)
					{
						for(i=1;i<(num/2);i+=2)
						{
							result=i*i;
							if(result==num)
							{
								count++;
								break;
							}
							l=i-((i/10)*10);

							if(l==1)   {i+=6;}	
						}
					}
					else if(d==9)
					{
						for(i=3;i<(num/2);i+=4)
						{
							result=i*i;
							if(result==num)
							{
								count++;
								break;
							}
							l=i-((i/10)*10);

							if(l==7)   {i+=2;}	
						}
					}
					else if(d==4)
					{								
						for(i=2;i<(num/2);i+=4)
						{							
							result=i*i;
							if(result==num)
							{						
								count++;
								break;
							}
							l=i-((i/10)*10);

							if(l==2)   {i+=2;}	
						}
					}
					else if(d==6)
					{
						for(i=4;i<(num/2);i+=2)
						{
							result=i*i;
							if(result==num)
							{
								count++;
								break;
							}
							l=i-((i/10)*10);

							if(l==6)   {i+=6;}	
						}
					}
					else if(d==5)
					{
						for(i=5;i<(num/2);i+=10)
						{
							result=i*i;
							if(result==num)
							{
								count++;
								break;
							}	
						}
					}
					else if(d==0)
					{
						for(i=0;i<(num/2);i+=10)
						{
							result=i*i;
							if(result==num)
							{
								count++;
								break;
							}	
						}
					}							
					if(count!=0 || num==4 || num==1 || num==0) {System.out.println(num);}					
				}
			}					
		}
	}
}