public class Chopsticks {

	public int getmax(int[] l) {
		int s = l.length;
		int n[] = new int[101];
		int ans = 0;

		for(int i=0; i<101; i++) {
			n[i] = 0;
		}
		for(int i=0; i<s; i++) {
			n[l[i]]++;
		}
		
		for(int i=0; i<101; i++) {
			ans += n[i] / 2;
		}

		return ans;
	}

}
