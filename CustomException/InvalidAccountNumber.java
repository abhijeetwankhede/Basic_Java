package CustomException;

public class InvalidAccountNumber extends Throwable {
	public InvalidAccountNumber() {
	}

	InvalidAccountNumber(String accountNumber) {
		super(accountNumber);
	}

}
