public class PracticeDemo {
    public static void main(String[] args) {
        PracticeExercises practice = new PracticeExercises();

        System.out.println("2 + 3 = " + practice.add(2, 3));
        System.out.println("Is 8 even? " + practice.isEven(8));
        System.out.println("5! = " + practice.factorial(5));
        System.out.println("Score 82: " + practice.gradeMessage(82));
    }
}
