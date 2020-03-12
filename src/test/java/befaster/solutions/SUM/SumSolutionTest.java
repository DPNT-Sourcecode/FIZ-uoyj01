package befaster.solutions.SUM;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

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
        assertThat(sum.checkInputIsPositive(1), greaterThanOrEqualTo(0));
    }

    @Test
    public void checkInputLessThanHundred(){
        assertThat(sum.checkInputLessThanHundred(1), greaterThanOrEqualTo(0));
    }
}



