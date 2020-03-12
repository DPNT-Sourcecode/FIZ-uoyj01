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
    public void checkInputHasDigitThree() {
        assertEquals("fizz", fizzBuzzSolution.fizzBuzz(13));
    }

    @Test
    public void checkInputHasDigitFive() {
        assertEquals("buzz", fizzBuzzSolution.fizzBuzz(52));
    }

    @Test
    public void checkInputHasDigitThreeAndFive() {
        assertEquals("fizz buzz", fizzBuzzSolution.fizzBuzz(546));
    }

    @Test
    public void checkNumberIsDeluxe() {
        assertEquals(true, fizzBuzzSolution.allDigitsInNumberAreSame(11));
    }

    @Test
    public void checkInputHasAllSameDigitsAsTwo() {
        assertEquals("fizz deluxe", fizzBuzzSolution.fizzBuzz(222));
    }

    @Test
    public void checkInputHasAllSameDigitsAsThree() {
        assertEquals("fizz fake deluxe", fizzBuzzSolution.fizzBuzz(333));
    }

    @Test
    public void checkInputHasAllSameDigitsAsFive() {
        assertEquals("fizz buzz fake deluxe", fizzBuzzSolution.fizzBuzz(555));
    }

    @Test
    public void checkInputIsJustADeluxeNumber() {
        assertEquals("deluxe", fizzBuzzSolution.fizzBuzz(88));
    }

}

