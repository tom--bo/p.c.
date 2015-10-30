import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FortunateNumbers {

	public int getFortunate(int[] a, int[] b, int[] c) {
		int alen = a.length;
		int blen = b.length;
		int clen = c.length;
		Set<Integer> hset = new HashSet();
		
		for(int i=0; i<alen; i++) {
			for(int j=0; j<blen; j++) {
				for(int k=0; k<clen; k++) {
					hset.add(a[i] + b[j] + c[k]);
				}
			}
		}
		Iterator it = hset.iterator();
		int cnt = 0;
		while(it.hasNext()) {
			if(isFN((int) it.next())){
				cnt++;
			}
		}
		return cnt;
	}
	
	public boolean  isFN(int n){
		while(n != 0) {
			if(n % 10 != 8 && n %10 != 5) {
				return false;
			}
			n /= 10;
		}
		return true;
	}

}
