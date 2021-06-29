package codewar;

/*
 * Your task is to sort a given string. Each word in the string will contain a single number.
 * This number is the position the word should have in the result.
 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
 * If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
 * Examples
 * "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
 * "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
 */
public class Order {
	public static String order(String words) {

		String[] word = words.split(" "); // frazer divididas em array
		if (word[0] == "" && word.length <= 1) {
			return words;
		}
		String[] organize = new String[word.length];

		for (int i = 0; i < word.length; i++) {
			String[] aux = word[i].split(""); // palavra dividida em array

			for (int k = 0; k < aux.length; k++) {
				try {
					int num = Integer.parseInt(aux[k]);
					organize[num - 1] = word[i];
				} catch (Exception e) {
					System.out.println();
				}
			}

		}
		StringBuilder sb = new StringBuilder();

		for (int l = 0; l < organize.length; l++) {
			sb.append(organize[l]);
			if (l < organize.length - 1) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}
}
