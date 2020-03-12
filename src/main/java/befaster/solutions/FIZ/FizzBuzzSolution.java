package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String output = "";
        if (checkInputMoreThanZero(number) && checkInputLessThanMax(number)) {
            if(number % 3 == 0){
                output = "fizz";
            }
        }
        return output;
    }

    public boolean checkInputLessThanMax(int input) {
        if (input <= 9999) {
            return true;
        }
        return false;
    }

    public boolean checkInputMoreThanZero(int input) {
        if (input > 0) {
            return true;
        }
        return false;
    }
}
