package practice;
import java.util.Scanner;
class prime 
{
    public static void main(String args[])
    {
      Scanner sc =new Scanner(System.in);
      int num,shiva=0;
      System.out.println("enter the number:");
      num =sc.nextInt();
      for(int i=1;i<=num;i++)
      {
          if (num%i ==0)
          {
            shiva++;
          }  
      }
      if(shiva ==2)
      {
          System.out.println("prime");
      }
      else 
      {
          System.out.println("not prime");
      }
    }
}
