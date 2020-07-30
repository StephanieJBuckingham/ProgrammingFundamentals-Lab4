
public class Account {

	private static int numAccounts = 0;

	// Add number of object Accounts
	public Account() {
		numAccounts++;
	}

	// Create static object Accounts called Acct
	static Account Acct;

	public static void main(String[] args) {

		// Create new object Accounts
		Acct = new Account();
		Acct = new Account();
		Acct = new Account();
		Acct = new Account();
		Acct = new Account();
		Acct = new Account();

		// Prints out number of accounts created by accessing method getNumAccounts
		System.out.println("Accounts Created: " + getNumAccounts());

	}

	// Method to return number of accounts
	private static int getNumAccounts() {
		return numAccounts;
	}

}
