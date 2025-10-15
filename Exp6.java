import java.util.Scanner;

class Matrix {
    // Step 1: Data members
    int a[][], b[][], sum[][], t[][];
    int r, c, i, j;

    // Step 2: Method to read matrices
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns:");
        r = sc.nextInt();
        c = sc.nextInt();

        a = new int[r][c];
        b = new int[r][c];

        System.out.println("Enter First Matrix:");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Second Matrix:");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
            }
        }
    }

    // Step 3: Method to add matrices
    void addition() {
        sum = new int[r][c];
        for (i = 0; i < r; i++)
            for (j = 0; j < c; j++)
                sum[i][j] = a[i][j] + b[i][j];
    }

    // Step 4: Method to display sum
    void display() {
        System.out.println("Sum of matrices:");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++)
                System.out.print(sum[i][j] + " ");
            System.out.println();
        }
    }

    // Step 5: Method to transpose the sum matrix
    void transpose() {
        t = new int[c][r]; // transpose changes dimensions
        for (i = 0; i < r; i++)
            for (j = 0; j < c; j++)
                t[j][i] = sum[i][j];

        System.out.println("Transpose of the sum matrix:");
        for (i = 0; i < c; i++) {
            for (j = 0; j < r; j++)
                System.out.print(t[i][j] + " ");
            System.out.println();
        }
    }
}

public class Exp6 {
    public static void main(String[] args) {
        Matrix m = new Matrix();

        m.read();       // Read matrices
        m.addition();   // Add matrices
        m.display();    // Display sum
        m.transpose();  // Display transpose
    }
}
