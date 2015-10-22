import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheJackpotDivTwoTest {

    protected TheJackpotDivTwo solution;

    @Before
    public void setUp() {
        solution = new TheJackpotDivTwo();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] money = new int[]{1, 2, 3, 4};
        int jackpot = 2;

        int[] expected = new int[]{2, 3, 3, 4};
        int[] actual = solution.find(money, jackpot);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] money = new int[]{4, 7};
        int jackpot = 1;

        int[] expected = new int[]{5, 7};
        int[] actual = solution.find(money, jackpot);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] money = new int[]{1};
        int jackpot = 100;

        int[] expected = new int[]{101};
        int[] actual = solution.find(money, jackpot);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] money = new int[]{21, 85, 6, 54, 70, 100, 91, 60, 71};
        int jackpot = 15;

        int[] expected = new int[]{21, 21, 54, 60, 70, 71, 85, 91, 100};
        int[] actual = solution.find(money, jackpot);

        Assert.assertArrayEquals(expected, actual);
    }

}
