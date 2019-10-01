package CustomException;


public class BankService  {

	private String accountNumber;

	private double balance = 5000;


	public BankService() {
	}

	public BankService(String accountNumber, double amount) {
		this.accountNumber = accountNumber;
		this.balance = amount;
	}

	public void withdraw(int accountNumber, double amount) throws InvalidAccountNumber, InsufficientBalance {

		if (accountNumber != 101) {
			throw new InvalidAccountNumber("invalid Account number");
		}
		if (amount > balance) {
			throw new InsufficientBalance("insufficent balance");
		}

		balance = balance - amount;
		System.out.println(balance);
	}

}
