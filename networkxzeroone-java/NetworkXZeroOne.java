public class NetworkXZeroOne {

	public String reconstruct(String m) {
		char[] c = m.toCharArray();
		int len = c.length;
		int pattern = 0;
		
		for(int i=0; i<len; i++) {
			if(c[i] == 'o') {
				if(i%2 == 0) {
					pattern = 1;
				}
			}else if (c[i] == 'x') {
				if(i%2 == 1) {
					pattern = 1;
				}
			}
		}
		for(int i=0; i<len; i++) {
			if(pattern == 1) {
				if(i % 2 == 0) c[i] = 'o';
				else c[i] = 'x';
			}
			if(pattern == 0) {
				if(i % 2 == 0) c[i] = 'x';
				else c[i] = 'o';
			}
		}
		
		String ans = String.valueOf(c);
		return ans;
	}

}
