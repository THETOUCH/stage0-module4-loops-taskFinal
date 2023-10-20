package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int a, b, c;
        a = numberToPrint;
        b = power;
        c = 0;
        int sum = 1;
        for (int i = 0; i < b; i++) {
            sum = sum * a;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
