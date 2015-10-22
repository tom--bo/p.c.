// import java.lang.reflect.Array;
import java.util.Arrays;


public class TheJackpotDivTwo {

	public int[] find(int[] M, int J) {
		int len = M.length;
		int total = J;
		Arrays.sort(M);
		int i = 0, sum = 0;
		int[] diff = new int[len];

		for(; i<len-1; i++) {
			diff[i] = M[i+1] - M[i];
			sum += diff[i] * (i+1);
			if(sum >= J) {
				break;
			}
		}
		
		for(int j=0; j<i; j++) {
			total -= (M[i] - M[j]);
			M[j] = M[i];
		}
		
		int dist = total / (i+1);
		int extra = total % (i+1);
		for(int j = i; j >= 0; j--) {
			M[j] += dist;
			if(extra > 0) M[j] += 1;
			extra --;
		}

		return M;
	}

}
