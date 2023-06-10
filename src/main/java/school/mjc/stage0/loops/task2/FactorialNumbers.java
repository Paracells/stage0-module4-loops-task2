package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        System.out.println(1);
        int count = 1;
        int factorial = 1;
        while (printToInclusive >= count) {
            factorial *= count;
            System.out.println(factorial);
            count++;
        }
    }
}
