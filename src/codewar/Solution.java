package codewar;

/*
 * ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
 * If the function is passed a valid PIN string, return true, else return false.
 * Examples
 * "1234"   -->  true
 * "12345"  -->  false
 * "a234"   -->  false
 */
public class Solution {

	public static boolean validatePin(String pin) {
		boolean result;
		boolean b = pin.matches("\\d{4}|\\d{6}");
		if (b) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}
