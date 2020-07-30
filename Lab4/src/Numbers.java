public class Numbers {

	public static void main(String[] args) {

		// Initialize array called Numbers with integers
		int[] Numbers = { 34, 24, 20, 43, 4, 9, 100, 45 };

		// Initialize n as size of array
		int n = Numbers.length;

		// Call on method nextLargest
		nextLargest(Numbers, n);
	}

	// Create method that prints next largest integer in string
	public static void nextLargest(int[] Numbers, int n) {

		// Initialize variables
		int next, i, j;

		for (i = 0; i < n; i++) {
			// Print Integer.MAX_VALUE if there is not value higher than number
			next = Integer.MAX_VALUE;

			for (j = 0; j < n; j++) {
				if (Numbers[i] < Numbers[j]) {
					next = Numbers[j];
					break;
				}
			}
			//Print out array and next largest number
			System.out.println(Numbers[i] + ": " + next);
		}
	}
}