package befaster.solutions.SUM;

import befaster.runner.SolutionNotImplementedException;

@SuppressWarnings("unused")
public class SumSolution {

    public int compute(int x, int y) {
        return x + y;
    }

    public int checkInputIsPositive(int input) throws Exception {
        if (input < 0) {
            throw new Exception("Negative number is not accepted");
        }
        return input;
    }
}



