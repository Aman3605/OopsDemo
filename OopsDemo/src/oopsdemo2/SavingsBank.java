package oopsdemo2;

public class SavingsBank extends Account // child class of account
{

	private int min_bal; // can access only within the class
    protected int  balance;  // can access within the class & in the sub class
    
	public SavingsBank(int accNo, String name,int mb,int b) {
		super(accNo, name);
		// TODO Auto-generated constructor stub
		this.min_bal=mb;
		this.balance=b;
	}
	
	void display()
    {
            super.display(); // invoke super class method
            System.out.println ("Minimum Balance: "+min_bal);
            System.out.println ("Saving Balance: "+balance);
    }

}
