package day6;
import java.util.Scanner;
public class PerfectNumber {
public static void main(String[] args) {
	long n,sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number:");
	 n = sc.nextLong();
	sc.close();
	int i=1;
	while(i<=n/2)
	{
		if(n%i==0) {
			sum=sum+i;
	}
	i++;
}
	if(sum==n) {
		System.out.println(n+ "is a perfect number");
     }else 
    	 System.out.println("not an perfect number");
		
	
	}
		
}

