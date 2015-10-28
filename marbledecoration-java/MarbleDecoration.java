import java.util.Arrays;

public class MarbleDecoration {

	public int maxLength(int R, int G, int B) {
		int a[] = {R,G,B};
		Arrays.sort(a);
		int t1 = a[2];
		int t2 = a[1];
		
		if(t1 == t2) return t1*2;
		return t2*2+1;
	}

}
