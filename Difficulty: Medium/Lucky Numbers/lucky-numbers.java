class Solution {
	public static boolean isLucky(int n) {
		// code here
		int counter = 2;
		int remaining = n;
		while (counter <= remaining) {
			if (remaining % counter == 0) {
				return false;
			}
			else {
				remaining = remaining - (int) Math.floor(remaining / counter);
			}
			counter++;
		}
		return true;
	}
}