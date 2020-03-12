package befaster.solutions.FIZ;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzSolutionTest {
    private FizzBuzzSolution fizzBuzzSolution;

    @Before
    public void setup() {
        fizzBuzzSolution = new FizzBuzzSolution();
    }

    @Test
    public void checkInputLessThanHundred() throws Exception {
        assertEquals(true, fizzBuzzSolution.checkInputLessThanMax(1));
    }

    @Test
    public void checkInputMoreThanZero() throws Exception {
        assertEquals(true, fizzBuzzSolution.checkInputMoreThanZero(1));
    }

    @Test
    public void checkInputMultipleOfThree(){
        assertEquals("fizz", fizzBuzzSolution.fizzBuzz(6));
    }

    @Test
    public void checkInputMultipleOfFive() {
        assertEquals("buzz", fizzBuzzSolution.fizzBuzz(25));
    }

    @Test
    public void checkInputMultipleOfBothThreeAndFive() {
        assertEquals("fizz buzz", fizzBuzzSolution.fizzBuzz(60));
    }

    @Test
    public void checkInputNotMultipleOfBothThreeAndFive() {
        assertEquals("7", fizzBuzzSolution.fizzBuzz(7));
    }

    @Test
    public void checkInputHasNumberThree() {
        assertEquals("fizz", fizzBuzzSolution.fizzBuzz(13));
    }

    @Test
    public void checkInputHasNumberFive() {
        assertEquals("buzz", fizzBuzzSolution.fizzBuzz(52));
    }

}