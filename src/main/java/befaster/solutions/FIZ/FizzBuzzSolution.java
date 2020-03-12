package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String output = "";
        String inputString = number + "";
        if (checkInputMoreThanZero(number) && checkInputLessThanMax(number)) {
            if (number % 3 == 0 || inputString.contains("3")) {
                output = "fizz";
            }
            if (number % 5 == 0 || inputString.contains("5")) {
                if (!output.isEmpty()) {
                    output = output + " buzz";
                } else {
                    output = "buzz";
                }
            }
            if (number % 15 == 0) {
                output = "fizz buzz";
            }
            if (output.isEmpty()) {
                output = inputString;
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
