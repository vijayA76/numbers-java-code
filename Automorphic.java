/* automorphic number is a number when we square it the last digits match with the number
   for ex  5 ^ 2 = 25 , 25 ^ 2 = 625 , 76 ^ 2 = 5776 in given example as we see on squaring it match with
   its last digits.    */



import java.util.Scanner;
class Automorphic {

	public static void main(String ars[]) {

		int R1,R2,num,len,var,i,d,p;
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the first range: ");
		R1=sc.nextInt();
		System.out.print("Enter the second range: ");
		R2=sc.nextInt();
		
		for(num=R1;num<R2;num++)
		{						
			d=num-((num/10)*10);			

			len=num;
			p=1;
			for(i=0;len>0;i++)
			{
				len=len/10;
				p=p*10;			
			}
			var=(num*num)-(((num*num)/p)*p);						
			if(var==num)
			{
				System.out.println(num);
			}

			if(d==1 || d==6)   {num+=3;}														
		}		
	}
}