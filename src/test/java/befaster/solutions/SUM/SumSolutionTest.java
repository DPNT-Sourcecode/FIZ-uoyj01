package befaster.solutions.SUM;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.junit.Assert.assertEquals;

public class SumSolutionTest {
    private SumSolution sum;

    @Before
    public void setUp() {

        sum = new SumSolution();
    }

    @Test
    public void compute_sum() {
        assertThat(sum.compute(1, 1), equalTo(2));
    }

    @Test
    public void checkInputIsPositive() throws Exception {
        assertEquals(1, sum.checkInputIsPositive(1));
    }

    @Test
    public void checkInputLessThanHundred() throws Exception {
        assertEquals(1, sum.checkInputLessThanHundred(1));
    }

    @Test(expected = Exception.class)
    public void throwExceptionWhenInputNotPositive() throws Exception {
        assertEquals(1, sum.checkInputIsPositive(1));
    }
}






