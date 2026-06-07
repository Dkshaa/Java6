public class PracticeExercises {
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be zero or greater.");
        }

        int result = 1;
        for (int i = 2; i <= number; i++) {
            result = result * i;
        }
        return result;
    }

    public int largestNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Numbers must not be empty.");
        }

        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public int sumNumbers(int[] numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total = total + numbers[i];
        }
        return total;
    }

    public String gradeMessage(int score) {
        if (score >= 90) {
            return "Excellent";
        }
        if (score >= 75) {
            return "Good";
        }
        if (score >= 60) {
            return "Keep practicing";
        }
        return "Try again";
    }
}
