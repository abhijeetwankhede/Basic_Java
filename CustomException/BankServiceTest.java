package CustomException;

public class BankServiceTest {

	public static void main(String[] args) {
		
		BankService service=new BankService();
		try {
			service.withdraw(
					01, 1424);
		} catch (InvalidAccountNumber e) {
			System.out.println(e.getMessage());
		} catch (InsufficientBalance e) {
			System.out.println(e.getMessage());

		}

	}

}
