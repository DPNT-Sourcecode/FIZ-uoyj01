package befaster.solutions.FIZ;

import java.util.ArrayList;
import java.util.List;

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

            String deluxeType = defineNewDeluxeNumber(number, 3);
            if (deluxeType == null) {
                deluxeType = defineNewDeluxeNumber(number, 5);
            }
            if (deluxeType != null) {
                if (!output.isEmpty()) {
                    output = output + " " + deluxeType;
                } else {
                    output = deluxeType;
                }
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

    public String defineNewDeluxeNumber(int number, int divisor) {
        String inputString = number + "";
        if (number % divisor == 0 && inputString.contains(divisor + "")) {
            if (number % 2 == 0) {
                return "deluxe";
            } else {
                return "fake deluxe";
            }
        }
        return null;
    }
}


