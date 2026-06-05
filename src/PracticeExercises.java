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
