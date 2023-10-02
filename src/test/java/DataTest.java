import org.testng.Assert;
import org.testng.annotations.Test;

public class DataTest {
    int[] oddImput = {-45, 590, 234, 985, 12, 68};
    int[] sumImput = {0, 1, 2, 3, 4, 5}, sumImput1 = {-7, -3};
    int[] oddExpected = {590, 985, 68};
    int aBig = 3333, bBig = 9999;
    int aPositive = 555, bPositive = 0, cPositive = -555;
    int aEqual = 89, bEqual = 89, cEqual = -89;
    int aM = 15, bM = 25, cM = 33, dM = 8, eM = 0;
    int[] aMMA = {1, 2, 3, 4, 5, 6, 7, 8}, dMMA = {3, 7, 5};
    int bMMA = 2, cMMA = 6;
    int[] aIntersection = {1, 2, 4, 5, 89}, bIntersection = {18, 9, 4, 2},
            cIntersection = {1, 2, 4, 5, 8, 9}, dIntersection = {8, 9, -4, -2},
            eIntersection = {8, 9, 45}, fIntersection = {2, 4},
            gIntersection = {8, 9}, hIntersection = {};
    int[] aPeakElement = {3, 2, 7, 5, 1, 9, 23, 1}, bPeakElement = {3, 7, 23};
    int[] aReverseArray = {2, 7, 3, 10}, bReverseArray = {10, 3, 7, 2};
    int[] aSortArray = {4, 3, 7, 12, 5, 2, 9, 4, 12}, bSortArray = {2, 3, 4, 4, 5, 7, 9, 12, 12};
    int[] aKthLargest = {4, 3, 7, 12, 5, 2, 9, 4, 12};
    int bKthLargest = 3, cKthLargest = 9;
    int[] aNegativeOnTheRight = {4, -3, 7, -12, 5, -2, 9, 4, 12}, bNegativeOnTheRight = {4, 7, 5, 9, 4, 12, -3, -12, -2};
    int[] aSumOfTwo = {4, 3, 7, 12, 5, 2, 9, 4, 12};
    int[][] bSumOfTwo = {{3, 9}, {5, 7}};
    int cSumOfTwo = 12;
    int[] aNumberOccurrences = {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};
    int[][] bNumberOccurrences = {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}};

    @Test
    public void testOddEven() {

    }

    @Test
    public void testOddIndices() {
        Assert.assertEquals(Main.OddIndices(oddImput), oddExpected);
    }

    @Test
    public void testSum() {
        Assert.assertEquals(Main.SumArray(sumImput), 15);
        Assert.assertEquals(Main.SumArray(sumImput1), -10);
    }

    @Test
    public void testBiggerValue() {
        Assert.assertEquals(Main.BiggerValue(aBig, bBig), 9999);
    }

    @Test
    public void testIsPositiveNumber() {
        Assert.assertTrue(Main.IsPositiveNumber(aPositive));
        Assert.assertEquals(Main.IsPositiveNumber(bPositive), true);
        Assert.assertFalse(Main.IsPositiveNumber(cPositive));
    }

    @Test
    public void testAreNumbersEqual() {
        Assert.assertEquals(Main.AreNumbersEqual(aEqual, bEqual), 0);
        Assert.assertEquals(Main.AreNumbersEqual(cEqual, bEqual), -1);
        Assert.assertEquals(Main.AreNumbersEqual(aEqual, cEqual), 1);
    }

    @Test
    public void testM() {
        Assert.assertEquals(Main.M(aM), "Good Number");
        Assert.assertEquals(Main.M(bM), "Poor Number");
        Assert.assertEquals(Main.M(cM), "Bad Number");
        Assert.assertEquals(Main.M(dM), "-1");
        Assert.assertEquals(Main.M(eM), "-1");
    }

    @Test
    public void testMinMaxAve() {
        Assert.assertEquals(Main.MinMaxAve(aMMA, bMMA, cMMA), dMMA);
    }

    @Test
    public void testIntersection() {
        Assert.assertEquals(Main.Intersection(aIntersection, bIntersection), fIntersection);
        Assert.assertEquals(Main.Intersection(cIntersection, dIntersection), gIntersection);
        Assert.assertEquals(Main.Intersection(aIntersection, eIntersection), hIntersection);
    }

    @Test
    public void testPeakElement() {
        Assert.assertEquals(Main.PeakElement(aPeakElement), bPeakElement);
    }

    @Test
    public void testReverseArray() {
        Assert.assertEquals(Main.ReverseArray(aReverseArray), bReverseArray);
    }

    @Test
    public void testSortArray() {
        Assert.assertEquals(Main.SortArray(aSortArray), bSortArray);
    }

    @Test
    public void testKthLargest() {
        Assert.assertEquals(Main.KthLargest(aKthLargest, bKthLargest), cKthLargest);
    }

    @Test
    public void testNegativeOnTheRight() {
        Assert.assertEquals(Main.NegativeOnTheRight(aNegativeOnTheRight), bNegativeOnTheRight);
    }

    @Test
    public void testSumOfTwo() {
        Assert.assertEquals(Main.SumOfTwo(aSumOfTwo, cSumOfTwo), bSumOfTwo);
    }

    @Test
    public void testNumberOccurrences() {
        Assert.assertEquals(Main.NumberOccurrences(aNumberOccurrences), bNumberOccurrences);
    }
}
