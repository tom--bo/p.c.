import java.util.Arrays;

public class SRMCards {

	public int maxTurns(int[] cards) {
		int ans = 0;
		Arrays.sort(cards);
		int l = cards.length;
		for(int i=0; i< l; i++) {
			if(i==l-1) {
				ans++;
				break;
			}
			if(cards[i+1] - cards[i] <= 1) {
				i++;
			}
			ans++;
		}

		return ans;
	}

}
