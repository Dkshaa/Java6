public class PracticeChecks {
    public static void main(String[] args) {
        PracticeExercises practice = new PracticeExercises();

        check("add", practice.add(4, 6) == 10);
        check("isEven", practice.isEven(12));
        check("factorial", practice.factorial(4) == 24);
        check("largestNumber", practice.largestNumber(new int[] { 3, 9, 2, 7 }) == 9);
        check("sumNumbers", practice.sumNumbers(new int[] { 1, 2, 3, 4 }) == 10);
        check("gradeMessage", "Good".equals(practice.gradeMessage(80)));

        System.out.println("All practice checks passed.");
    }

    private static void check(String name, boolean passed) {
        if (!passed) {
            throw new IllegalStateException(name + " check failed.");
        }
    }
}
