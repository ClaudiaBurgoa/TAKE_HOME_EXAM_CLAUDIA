package numbers;

// exercise 1 . take home exam for CLAUDIA BURGOA UZIEDA
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		int i;
		int NthNumber = 0;
		int Number;
		List<Integer> Lista = new ArrayList<Integer>();

		Random randomNum = new Random();
		System.out.println("GENERATING RANDOM NUMBERS:");
		System.out.println();
		for (i = 0; i <= 499; i++) {

			Number = randomNum.nextInt(1000);
			System.out.println(i + "--> " + Number);

			Lista.add(Number);
		}
		// System.out.println("ArrayList : " + Lista.toString());

		NthNumber = Lista.get(0);
		for (int i2 = 1; i2 <= 499; i2++) {

			if (NthNumber < Lista.get(i2)) {
			} else
				NthNumber = Lista.get(i2);
		}
		System.out.println();
		System.out.println("The Nth Smallest number is: " + NthNumber);

	}
}
