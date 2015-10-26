public class TheAlmostLuckyNumbersDivTwo {

	public int find(int a, int b) {
		int cnt = 0;
		for(int i=a; i<=b; i++) {
			if(islucky(i)) cnt++;
		}
		return cnt;
	}
	
	public boolean islucky(int a) {
		int t = a;
		int cnt = 0;
		while(t != 0) {
			if(t %10 != 4 && t %10 != 7) {
				cnt++;
			}
			t/=10;
		}
		return (cnt < 2) ? true:false;
	}

}
