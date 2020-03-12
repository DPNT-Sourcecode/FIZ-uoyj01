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
            if (numberIsDeluxe(number)) {
                if (!output.isEmpty()) {
                    output = output + " deluxe";
                } else {
                    output = "deluxe";
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

    public boolean numberIsDeluxe(int input) {
        List<Integer> digits = new ArrayList<>();
        int prev = -1;
        if (input < 10){
            return false;
        }
        while (input > 0) {
            digits.add(input % 10);
            input = input / 10;
        }
        if (digits.isEmpty()) {
            return false;
        } else {
            for (int i = 0; i < digits.size(); i++) {
                if (i == 0) {
                    prev = digits.get(i);
                } else {
                    if (prev == digits.get(i)) {
                        prev = digits.get(i);
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
