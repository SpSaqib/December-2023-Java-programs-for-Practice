package ControlFlowStatements;

class DoWhile {
	 
    // Main driver method
    public static void main(String[] args)
    {
        // initial counter variable
        int i = 0;
 
        do 
        {
 
            // Body of loop that will execute minimum
            // 1 time for sure no matter what
            System.out.println("Print statement"+i);
            i++;
        }
 
        // Checking condition
        // Note: It is being checked after
        // minimum 1 iteration
        while (i <= 10);
        
        {
            System.out.println("after while" +i);
           
        }
    }
}