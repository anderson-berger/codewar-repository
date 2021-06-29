package codewar;

/*
 * Simple, given a string of words, return the length of the shortest word(s).
 *String will never be empty and you do not need to account for different data types.
 */
public class Kata {
	
	public static int findShort(String s) {
		String[] arrString = s.split(" ");
		int aux = arrString[0].length();
		for (String arr : arrString) {
			if (arr.length() < aux) {
				aux = arr.length();
			}
		}
		return aux;
	}
}