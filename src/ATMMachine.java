import java.util.*;
public class ATMMachine {
	public HashMap Bank = new HashMap(); 
	
	public ATMMachine () {
		
	}
	
	public void deposit (String ID, double amount) {
		if(amount > 0 )
		{
		
			if(!Bank.containsKey(ID)) {
			Bank.put(ID, amount);
		
		}
		else {
			double currentAmount = (double)Bank.get(ID);
			double newAmount = amount + currentAmount;
			Bank.replace (ID, newAmount);
		}
		}
	}
	
	public String checkAmount(String ID)
    {
        if (!Bank.containsKey(ID))
        {
        	return("ID does not exist.");
        }
        
        return(Bank.get(ID).toString());
    }

	public void withdraw(String ID, double amount)
    {
		if(amount > 0 && Bank.containsKey(ID)&& !(amount > (double)Bank.get(ID)))
		{
        
            double currentAmount = (double)Bank.get(ID);
            double newAmount = currentAmount - amount;
            Bank.replace (ID, newAmount);
  
    
    }
    }
	
	public static void main (String [] args)
	{
		ATMMachine hello = new ATMMachine(); 
		hello.deposit("Winfrey", 25159684372.43);
		hello.deposit("Bezos", 193495330293.43);
		System.out.println(hello.checkAmount("Bezos")); 
		hello.deposit("Bezos", 20394353.35);
		System.out.println(hello.checkAmount("Bezos")); 
		hello.withdraw("Bezos", 3593293.66);
		System.out.println(hello.checkAmount("Bezos")); 
		hello.deposit("MrTheiss", 64033.55);
		hello.withdraw("MrTheiss", 443964.46);
		
		System.out.println(hello.checkAmount("Bezos")); 
		System.out.println(hello.checkAmount("Winfrey")); 
		System.out.println(hello.checkAmount("YoMama")); 
		System.out.println(hello.checkAmount("MrTheiss"));
		
	}
}