import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MarbleDecorationTest {

    protected MarbleDecoration solution;

    @Before
    public void setUp() {
        solution = new MarbleDecoration();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int R = 0;
        int G = 0;
        int B = 0;

        int expected = 0;
        int actual = solution.maxLength(R, G, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int R = 3;
        int G = 0;
        int B = 0;

        int expected = 1;
        int actual = solution.maxLength(R, G, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int R = 5;
        int G = 1;
        int B = 2;

        int expected = 5;
        int actual = solution.maxLength(R, G, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int R = 7;
        int G = 7;
        int B = 4;

        int expected = 14;
        int actual = solution.maxLength(R, G, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int R = 2;
        int G = 3;
        int B = 5;

        int expected = 7;
        int actual = solution.maxLength(R, G, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int R = 13;
        int G = 13;
        int B = 13;

        int expected = 26;
        int actual = solution.maxLength(R, G, B);

        Assert.assertEquals(expected, actual);
    }

}
