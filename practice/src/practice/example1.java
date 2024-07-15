package practice;
import java.util.Scanner;
public class kodi
{
	public static void main(String[] args)
	{
     Scanner sc=new Scanner(System.in);
	 int num, kodi=0;
      System.out.println("enter the number:");
      num=sc.nextInt();
      for(int i=1;i<=num;i++)
      {
    	  if(num%i==0)
	{
    		  kodi++;
	}
      }
		if(kodi ==2)
      {
    	  System.out.println("it is a prime");
      }
      else
      {
    	  System.out.println("it is not a prime");
      }
	
}
}
