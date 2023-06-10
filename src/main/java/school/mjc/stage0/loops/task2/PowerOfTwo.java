package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        }

        int count = 1;
        while (power >= 0) {
            System.out.println(count);
            count = count * 2;
            power--;
        }
    }
}
