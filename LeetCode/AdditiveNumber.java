import java.math.*;
public class AdditiveNumber {

	public static void main(String[] args) {
		String str = "112358";
		//String str = "112";
		System.out.println(isAdditiveNumber(str));

	}

	public static boolean isAdditiveNumber(String num) {
		for (int i = 1; i < num.length(); i++) {
			for (int j = i + 1; j < num.length() - i + 1; j++) {
				String first = num.substring(0, i);
				String second = num.substring(i, j);
				if (isValid(j, first, second, num)) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean isValid(int start, String first, String second, String num) {
		if (start == num.length()) {
			return true;
		}
		if ((first.charAt(0) == '0' && first.length() > 1) || (second.charAt(0) == '0' && second.length() > 1)) {
			return false;
		}
		BigInteger f = new BigInteger(first);
		BigInteger s = new BigInteger(second);
		BigInteger sum = f.add(s);
		String sumStr = sum.toString();
		if (sumStr.length() + start > num.length()) {
			return false;
		}
		System.out.println("has following:" + first + " : " + second + " : " + start);
		if (!num.substring(start, start + sumStr.length()).equals(sumStr)) {
			return false;
		}
		return isValid(start + sumStr.length(), second, sumStr, num);

	}

}
