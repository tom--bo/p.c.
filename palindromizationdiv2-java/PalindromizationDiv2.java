public class PalindromizationDiv2 {

	public int getMinimumCost(int X) {
		if(X <= 9) return 0;
		for(int i=0; i<X; i++) {
			if(isPalindromic(X+i)) return i;
			if(isPalindromic(X-i)) return i;
		}
		return 0;
	}
	public boolean isPalindromic(int a) {
		int t = a;
		int len = 0;
		while(t != 0) {
			t /= 10;
			len++;
		}
		int[] tmp = new int[len];
		for(int i=len-1; i>=0; i--) {
			tmp[i] = a % 10;
			a /= 10;
		}
		for(int i=0; i<len; i++) {
			if(tmp[i] != tmp[len-1-i]) {
				return false;
			}
		}
		return true;
	}
}
