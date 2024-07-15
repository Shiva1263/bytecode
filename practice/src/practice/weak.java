package practice;
import java.util.Scanner;                     

public class weak                             
{                                             
	public static void main(String[] args)       
	{                                            
	Scanner sc=new Scanner(System.in) ;          
	int weak;                                    
	System.out.println("enter the weak number:");
	weak=sc.nextInt();                           
	switch (weak)                                
	{                                            
	case 1:                                      
		System.out.println("sunday");               
		break;                                      
	case 2:                                      
		System.out.println("moday");                
		break;                                      
	case 3:                                      
		System.out.println("tuesday");              
		break;                                      
	case 4:                                      
		System.out.println("wednesday");            
		break;                                      
	case 5:                                      
		System.out.println("thursday");             
		break;                                      
	case 6:                                      
		System.out.println("friday");               
		break;                                      
	case 7:                                      
		System.out.println("saturday");             
		break;                                      
		default:                                    
	}                                            
	}                                            
}                                             
                                              