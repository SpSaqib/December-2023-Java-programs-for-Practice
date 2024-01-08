package Methods;

import java.util.Scanner;

public class DigitsSumInNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//Take a number as 225
		int num=sc.nextInt();
		System.out.println("Given number is : "+num);
		
		
		int sum=0;
		int i=0;
		while(num>0)
		{
			sum=sum+num%10;
			
			num=num/10;
			i++;
		}

		System.out.println("Sum of the Digits in the Number is : "+sum);
		System.out.println("Number of digits in a number is : "+i);
	}

}