import java.util.Scanner;
class Palindrome {

	public static void main(String[] args) {

		int R1,R2,num,var,result,len,i;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the first range: ");
		R1=sc.nextInt();
		System.out.print("Enter the second range: ");
		R2=sc.nextInt();

		for(num=R1;num<R2;num++)
		{												
			var=num;
			len=var;
			result=0;
			for(i=0;len>0;i++)
			{
				len=len/10;
				var=var-((var/10)*10);		
				result=var+(result*10);
				var=len;
			}
			if(result==num)
			{
				System.out.println(num);
			}
		}
	}
}