package n4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BiggestNumberFindTest {

    private int[] numbers = {2, 4, 5, 10, 20, 30, 40, 5, 3, 34, 53, 100, 34, 625};
    private BiggestNumberFinder biggestNumberFinder = new Main() ;

    @Test(expected = Error.class)
    public void getBiggestNumber() {
        int expectedNotAccept = 100;
        int max = biggestNumberFinder.findTheBiggestNumber(numbers);
        assertEquals("Should be 100", expectedNotAccept, max);
    }

    @Test
    public void getBiggestAccept(){
        int expectedAccept = 625;
        int max = biggestNumberFinder.findTheBiggestNumber(numbers);
        assertEquals("Should be 625", expectedAccept, max);
    }
}
