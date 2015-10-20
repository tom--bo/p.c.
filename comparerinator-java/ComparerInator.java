public class ComparerInator {

	public int makeProgram(int[] A, int[] B, int[] W) {
		int len = A.length;
		int a = 0;
		int b = 0;
		int lt = 0;
		int mt = 0;
		for(int i=0; i< len; i++) {
			if(A[i] != W[i]) a = 1;
			if(B[i] != W[i]) b = 1;
			int t1 = A[i]<B[i]? A[i]:B[i];
			int t2 = A[i]>B[i]? A[i]:B[i];
			if(t1 != W[i]) lt = 1;
			if(t2 != W[i]) mt = 1;
		}
		if(a == 0 || b==0) return 1;
		if(lt == 0 || mt == 0) return 7;
		
		return -1;
	}

}
