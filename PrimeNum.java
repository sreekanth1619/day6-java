package day6;
import java.util.Scanner;

public class PrimeNum {
public static void main(String[] args) {
	int a;
	boolean Prime=true;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	
	
	int num=sc.nextInt();
	sc.close();
	
	for(int i=2;i<=num/2;i++)
	{
		a=num%i;
		if(a==0)
		{
			Prime=false;
			break;
			
		}
	}
	if(Prime)
		
	System.out.println("number is prime");
	else
    System.out.println("not prime");
	

}
}


