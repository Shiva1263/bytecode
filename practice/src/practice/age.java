package practice;
import java.util.Scanner;
public class age {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int age;
	System.out.println("enter the age:");
	age=sc.nextInt();
	if(age<18)
	{
		System.out.println("not eligible to vote");
	}
	{
		System.out.println("eligible to vote");
	}
	}
}
