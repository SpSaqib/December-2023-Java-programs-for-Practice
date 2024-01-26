package String;

public class ValueOf {

	public static void main(String[] args) {
		
		int value=30;  
		String s1=String.valueOf(value);  
		System.out.println(s1+10);//concatenating string with 10, 3010
		
		boolean bol = true;    
        boolean bol2 = false;    
        String s3 = String.valueOf(bol);    
        String s4 = String.valueOf(bol2);  
        System.out.println(s3);  
        System.out.println(s4);  
        
        char ch1 = 'A';    
        char ch2 = 'B';  
        String s5 = String.valueOf(ch1);    
        String s6 = String.valueOf(ch2);  
        System.out.println(s5);  
        System.out.println(s6); 
        
        


	}

}
