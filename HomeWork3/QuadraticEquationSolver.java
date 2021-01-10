package HomeWork3;

import java.util.Arrays;

public class QuadraticEquationSolver {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(4, 5, 9)));
    }

    public static double[] solve(int a, int b, int c) {
        double D = b * b - 4 * a * c;
        int i;
        double[] solve;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            i = 2;
            solve = new double[] {x1, x2};
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            solve = new double[] {x};
        }
        else {
            solve = new double[0];
        }
return solve;
    }
}
