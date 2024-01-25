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
		
		catch(ArithmeticException e)
		{
			System.out.println("I am from Arithmetic Exception Exception");
		}
		
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("I am from Array Index OutOf Bounds Exception Exception");
		}
		
		catch(Exception e)
		{
			System.out.println("I am from Exception");
		}
		
		catch (Throwable e)
		{
			System.out.println("Hello throwable exception");
		}
		
		finally
		{
			System.out.println("I am from finally");
		}
		

	}

}
