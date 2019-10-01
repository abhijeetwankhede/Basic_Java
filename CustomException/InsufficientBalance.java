package CustomException;

public class InsufficientBalance extends Throwable {

	public InsufficientBalance() {
	}

	InsufficientBalance(String balance) {
		super(balance);
	}

}
