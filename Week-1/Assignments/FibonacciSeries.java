package week1;

public class FibonacciSeries {

    public static void main(String[] args) {

        int range = 8;
        int a = 0, b = 1;

        for (int index = 0; index < range; index++) {

            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;

        }

    }

}
