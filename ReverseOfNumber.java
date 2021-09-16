package day6;

import java.util.Scanner;

public class ReverseOfNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int num = sc.nextInt();
	sc.close();
	int rev=0;
	while(num!=0)
	{
		rev=rev * 10 + num % 10;
		num=num/10;
	}
	System.out.println("the reverse of a number is:" +rev);
}
}
