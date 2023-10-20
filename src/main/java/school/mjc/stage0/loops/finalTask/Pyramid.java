package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int z = 0; z < cathetusLength - i; z++) {
                System.out.print(" ");
            }
//            for (int j = 1; j<=i; j++) {
//                System.out.print(j);
//            }
            for(int j = i; j !=0; j--) {
                System.out.print(j);
            }
            for (int k=2;k<=i;k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
