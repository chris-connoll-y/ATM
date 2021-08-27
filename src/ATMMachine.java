import java.util.*;
public class ATMMachine {
	private HashMap Bank;
	public ATMMachine () {
		
	}
	
	public void deposit (String ID, double amount) {
		if (!Bank.containsKey(ID)) {
			Bank.put(ID, amount);
		}
		else {
			double currentAmount = (double)Bank.get(ID);
			double newAmount = amount + currentAmount;
			Bank.replace (ID, newAmount);
		}
	}
	
	
}
