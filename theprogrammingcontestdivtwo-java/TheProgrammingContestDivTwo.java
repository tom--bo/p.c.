import java.util.Arrays;

public class TheProgrammingContestDivTwo {

	public int[] find(int T, int[] rt) {
		int now = 0;
		int cnt = 0;
		int sum = 0;
		Arrays.sort(rt);
		for(int i=0; i< rt.length; i++) {
			if(now + rt[i] <= T) {
				cnt++;
				sum += now + rt[i];
				now += rt[i];
			}
		}
		int ans[] = {cnt, sum};
		System.out.println(cnt + ", " + sum);
		return ans;
	}
}
