public class MagicalGirlLevelOneDivTwo {

	public double theMinDistance(int d, int x, int y) {
		int toX=0, toY=0;
		if(Math.abs(x) > d) {
			toX = Math.abs(x) -d;
		}
		if(Math.abs(y) > d) {
			toY = Math.abs(y) -d;
		}
		double ans = Math.sqrt((double) (toX*toX+toY*toY));
		return ans;
	}

}
