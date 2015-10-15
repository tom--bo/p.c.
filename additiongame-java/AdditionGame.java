import java.util.Arrays;

public class AdditionGame {

	public int getMaximumPoints(int A, int B, int C, int N) {
		int[] num = {A, B, C};
		int ans = 0;

		for(int i=0; i< N; i++) {
			Arrays.sort(num);
			if(num[2] == 0) return ans;
			ans += num[2];
			num[2] -= 1;
		}

		return ans;
	}

}
