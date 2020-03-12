package befaster.solutions.HLO;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloSolutionTest {

    private HelloSolution greeting;

    @Before
    public void setup(){
        greeting = new HelloSolution();
    }

    @Test
    public void helloTest() {
        assertEquals("Hello, John!", greeting.hello("John"));
    }
}