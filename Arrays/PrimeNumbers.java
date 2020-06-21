public class PrimeNumbers {

	public static void main(String[] arg) {
		int number = 30;
		System.out.println("From Main");
		findPrimeNumbers(number);

	}

	private static void findPrimeNumbers(int number) {

		boolean[] prime = new boolean[number + 1];
		for(int i=0;i<prime.length;i++)
			prime[i]=true;
		for (int p = 2; p * p <= number; p++) {
			if (prime[p]) {
				for (int i = p * p; i <= number; i += p) {
					prime[i] = false;
				}
			}
		}

		for (int i = 2; i <= number; i++) {
			if (prime[i]) {
				System.out.println(i);
			}
		}
	}
}
