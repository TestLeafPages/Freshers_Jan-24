package week3.day1;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		int num[] = { 2, 3, 1, 4, 5, 6, 4 };

		// System.out.println(num[0]);
		// 1 2 3 4 4 5 6
		Arrays.sort(num);// this is the method used to arrange the values in accending order
		// System.out.println(num[0]);
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println(num[i]);
				}

			}

		}

	}

}
