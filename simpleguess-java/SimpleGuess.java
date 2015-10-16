import java.util.Arrays;

public class SimpleGuess {

	public int getMaximum(int[] hints) {
		int len = hints.length;
		Arrays.sort(hints);
		int max = hints[len-1];
		int ans = 0;
		int diff;

		for(int i=1; i<=max/2; i++) {
			diff = max - i*2;
			if(Arrays.binarySearch(hints, diff) >= 0 && ans < i*(max-i)) {
				ans = i*(max-i);
			}
		}

		return ans;
	}

}
