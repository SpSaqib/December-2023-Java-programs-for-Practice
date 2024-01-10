package Inheritance;

public class AccountDriver {

	public static void main(String[] args) 
	{
		
		SavingsAccount a1=new SavingsAccount();
		
		System.out.println(a1.acc_holder_Name);
		System.out.println(a1.acc_No);
		System.out.println(a1.ifsc);
		System.out.println(a1.available_balance);
		
		LoanAccount la=new LoanAccount();
		System.out.println(la.acc_holder_Name);
		System.out.println(la.acc_No);
		System.out.println(la.ifsc);
		System.out.println(la.available_balance);
		System.out.println(la.loan_Amount);
	}

}
