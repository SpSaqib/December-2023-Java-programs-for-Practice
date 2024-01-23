package ExceptionHandling;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TryCatch1 {
	
	public static void exceptionHandling()
	{
		try
		{
			
		}
		catch(Exception e)
		{
			
		}
		
	}
	
	
	

	public static void main(String[] args) {
		try
		{
			int[] c= {2,3,4};
           System.out.println(c[3]);
			
		}
		
		
		
		finally
		{
			System.out.println("I am from finally");
		}
		

	}

}
