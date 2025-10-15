// Demonstration of Looping Statement

import java.util.*;
public class Exp2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i+"  ");
            }
        }
    }
}
