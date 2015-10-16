import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleGuessTest {

    protected SimpleGuess solution;

    @Before
    public void setUp() {
        solution = new SimpleGuess();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] hints = new int[]{1, 4, 5};

        int expected = 6;
        int actual = solution.getMaximum(hints);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] hints = new int[]{1, 4, 5, 8};

        int expected = 12;
        int actual = solution.getMaximum(hints);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] hints = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};

        int expected = 20;
        int actual = solution.getMaximum(hints);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] hints = new int[]{2, 100};

        int expected = 2499;
        int actual = solution.getMaximum(hints);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] hints = new int[]{50, 58, 47, 57, 40};

        int expected = 441;
        int actual = solution.getMaximum(hints);

        Assert.assertEquals(expected, actual);
    }

}
