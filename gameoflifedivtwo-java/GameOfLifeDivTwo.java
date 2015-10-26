public class GameOfLifeDivTwo {

	public String theSimulation(String init, int T) {
		char ini[] = init.toCharArray();
		char ini2[] = init.toCharArray();
		int len = ini.length;
		
		for(int a=0; a<T; a++) {
			for(int i=0; i< len; i++) {
				int tmp = i+len;
				if(ini[(tmp-1)%len] == '0' && ini[(tmp+1)%len] == '0') {
					ini2[i] = (char)'0';
				}else if(ini[(tmp-1)%len] == '1' && ini[(tmp+1)%len] == '1') {
					ini2[i] = (char)'1';
				}else{
					ini2[i] = (char)ini[i];
				} 
			}
			for(int k=0; k<len;k++) {
				ini[k] = ini2[k];
			}
		}
		String ans = String.valueOf(ini);
		
		return ans;
	}
}
