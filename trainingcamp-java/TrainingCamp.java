public class TrainingCamp {

	public String[] determineSolvers(String[] attendance, String[] problemTopics) {
		int len = attendance.length;
		int lenp = problemTopics.length;
		char at[][] = new char[len][attendance[0].length()];
		char pr[][] = new char[lenp][attendance[0].length()];
		char a[][] = new char[len][lenp];
		
		for(int i=0; i<len; i++) {
			at[i] = attendance[i].toCharArray();
		}
		for(int j=0; j<lenp; j++) {
			pr[j] = problemTopics[j].toCharArray();
		}
		
		int num = at[0].length;
		for(int i=0; i<len; i++) {
			for(int j =0; j<lenp; j++) {
				int flg = 0;
				for(int k=0; k<num; k++) {
					if(at[i][k] == '-' && pr[j][k] == 'X'){
						a[i][j] = '-';
						break;
					}
					a[i][j] = 'X';
				}
			}
		}
		String ans[] = new String[len];
		for(int i=0; i<len; i++) {
			ans[i] = String.valueOf(a[i]);
		//	System.out.println(String.valueOf(a[i]));
		}
		
		return ans;
	}

}
