
public class Bank {
	private String accountNo;
	private String name;
	private int minBalance;
	private long balance;
	
	void Accept(String accountNo,String name,long balance) {
		this.accountNo=accountNo;
		this.name=name;
		this.balance=balance;
		this.minBalance=5000;
	}
	void Print() {
		Calculate();
		System.out.println("Account Number :"+accountNo);
		System.out.println("Account Holder Name :"+name);
		System.out.println("Account Balance :"+balance);
		
	}
	void Calculate() {
		if(balance>minBalance) {
			balance=balance+balance*1/100;
		}
		else {
			balance=balance-500;
		}
	}

}
