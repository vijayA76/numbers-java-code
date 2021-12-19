// ...... find armstrong numbers in given range .......

import java.util.Scanner;

class Armstrong {

	public static void main(String[] args) {

		int R1,R2,len,num,varnum,divnum,pseudovar,numpart,result,i,z;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the first range: ");
		R1=sc.nextInt();

		System.out.print("Enter the second range: ");
		R2=sc.nextInt();

		for(R1=R1;R1<R2;R1++)
		{
			num=R1;
			varnum=num;
											
			for(len=1;varnum>0;len++)
			{
				varnum=varnum/10;
			}
										
			varnum=num;			 							
		    result=0;

			for(z=1;z<len;z++)
			{
			 	pseudovar=varnum;
			 	varnum=varnum/10;
			 	divnum=pseudovar-(varnum*10);
										
			 	numpart=1;

			 	for(i=1;i<len;i++)
				{
					numpart=divnum*numpart;			 							
				}
			 	result=numpart+result;
			
			 	if (result==num && varnum==0)
				{
			 		System.out.print("\n"+num);
				}
			}
		}
	}
}
