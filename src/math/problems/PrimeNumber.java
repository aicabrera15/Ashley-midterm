package math.problems;
import java.util.*;
import java.util.ArrayList;

public class PrimeNumber {
	public static void main(String[] args) {
	/*
	 * Find list of Prime numbers from number 2 to 1 million.
	 * Try the best solution as possible.Which will take less CPU life cycle.
	 * Out put number of Prime numbers on the given range.
	 *
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 */

        System.out.println(primeNumbers(1000000));

}

	public static List<Integer> primeNumbers(int maxNumber) {
		List<Integer> primeNumbers = new ArrayList<>();

		if (maxNumber >= 2) {
			primeNumbers.add(2);
		}
		for (int i = 3; i <= maxNumber; i += 2) {
			if (isPrime(i)) {
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}

	//HELPER METHOD:

	private static boolean isPrime(int number) {
		for (int i = 2; i*i <= number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;

	}


}
