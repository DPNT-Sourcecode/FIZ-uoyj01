package befaster.solutions.FIZ;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzSolutionTest {
    private FizzBuzzSolution fizzBuzzSolution;
    @Before
    public void setup(){
        fizzBuzzSolution = new FizzBuzzSolution();
    }

    @Test
    public void checkInputLessThanHundred() throws Exception {
        assertEquals(true, fizzBuzzSolution.checkInputLessThanMax(1));
    }

}