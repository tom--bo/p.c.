import java.util.Arrays;

public class SlimeXSlimeRancher2 {

	public int train(int[] a) {
		int len = a.length;
		Arrays.sort(a);
		int max = a[len-1];
		int ans = 0;
		for(int i=0; i< len; i++) {
			ans += max - a[i]; 
		}

		return ans;
	}

}
