public class Filtering {

	public int[] designFilter(int[] s, String o) {
		int len = s.length;
		int n[] = new int[101];
		int flg = 0;
		int min = 1000,max = -1;
		int[] no = {};

		for(int i=0; i<len; i++) {
			if(o.charAt(i) == 'A') {
				n[s[i]] = 1;
			}else {
				n[s[i]] = -1;
			}
		}
		for(int i=0; i<101; i++) {
			if(n[i] == 1 && min>i) {
				min = i;
			}
			if(n[i] == 1 && max<i) {
				max = i;
			}
			if(min != 1000 && n[i] == -1) {
				flg = 1;
			}
			if(flg == 1 && n[i] == 1) {
				return no;
			}
		}
		int[] ans = {min, max};
		return ans;
	}
}
