
public class Account {

	static int numAccounts = 0;

	// Add number of object Accounts
	public Account() {
		numAccounts++;
	}

	public static void main(String[] args) {

		// Create new object Accounts
		Account one = new Account();
		Account two = new Account();
		Account three = new Account();
		Account four = new Account();
		Account five = new Account();
		Account six  = new Account();

		// Prints out number of accounts created by accessing method getNumAccounts
		getNumAccounts();

	}

	// Method to return number of accounts
	private static void getNumAccounts() {
		System.out.println("Accounts Created: " + numAccounts);
	}

}
