package week3.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {

		int[] num = { 4, 5, 7, 1, 2, 6 };

		Arrays.sort(num);

		// 1 2 4 5 6 7 // array values after sorting num[i]

		// 0 1 2 3 4 5

		// 1 2 3 4 5 6 // index values

		// length =6

		for (int i = 0; i < num.length; i++) {

			int j = i + 1;

			if (num[i] != j) {

				// 1 != 1
				// 2 != 2
				// 4 != 3
				System.out.println(j);
				break;

			}
		}

	}
}
