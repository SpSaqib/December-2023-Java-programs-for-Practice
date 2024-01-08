package ControlFlowStatements;

import java.util.Scanner;

public class PrintEvenNumbersTillN {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		System.out.println("The even numbers are : ");
		
		int i=1;
		while(i<=n )
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
				
				for(int j=1;j<=10;j++)
				{
					if(j%2==0)
					{
						System.out.println(j);
					}
					
				}
	}

}
