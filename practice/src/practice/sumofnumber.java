package practice;
import java.util.Scanner;
public class sumofnumber
{
	public static void main(String[] args)
	{
		int a,b,c,sum,sum1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		a=sc.nextInt();
		System.out.println("enter the second number");
		b=sc.nextInt();
		System.out.println("enter the third number");
		c=sc.nextInt();
		sum=a+b+c;
		sum1=sum;
		System.out.println("sum of three number a and b and c is :");
		System.out.println(sum1);
	}

}