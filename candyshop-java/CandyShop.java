public class CandyShop {

	public int countProbablePlaces(int[] X, int[] Y, int[] R) {
		int len = X.length;
		int[][]  f = new int[201][201];
		for(int i=0; i<len; i++) {
			X[i] += 100;
			Y[i] += 100;
		}
		for(int i=0; i<len; i++) {
			int Ri = R[i];
			for(int j=0; j<Ri+1; j++) {
				for(int k=j-Ri; k<=Ri-j; k++) {
					if(X[i]+k >= 0 && X[i]+k < 201 && Y[i]+j >= 0 && Y[i]+j < 201) {
						f[X[i]+k][Y[i]+j] += 1;
					}
					if(j != 0 && +X[i]-k >= 0 && X[i]-k < 201 && Y[i]-j >= 0 && Y[i]-j < 201) {
						f[X[i]-k][Y[i]-j] += 1;
					}
				}
			}
		}
		
		int cnt = 0;
		for(int i=0; i<201; i++) {
			for(int j=0; j<201; j++) {
				if(f[i][j] == len) cnt++;
			}
		}
		
		return cnt;
	}
}
