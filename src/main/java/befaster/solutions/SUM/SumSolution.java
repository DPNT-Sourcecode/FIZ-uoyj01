package befaster.solutions.SUM;

import befaster.runner.SolutionNotImplementedException;

@SuppressWarnings("unused")
public class SumSolution {

    public int compute(int x, int y) throws Exception {
        checkInputIsPositive(x);
        checkInputIsPositive(y);
        checkInputLessThanHundred(x);
        checkInputLessThanHundred(y);
        return x + y;
    }

    public int checkInputIsPositive(int input) throws Exception {
        if (input < 0) {
            throw new Exception("Negative number is not accepted");
        }
        return input;
    }

    public int checkInputLessThanHundred(int input) throws Exception {
        if (input > 100) {
            throw new Exception("Number cannot be greater than 100");
        }
        return input;
    }
}





