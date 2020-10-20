package misc;

/**
 * Created by wesley on 11/11/2019.
 */
public class QuadraticEquation {

    public static Roots findRoots(double a, double b, double c) {
        double squareMatrixResult = Math.sqrt(b * b - 4 * a * c);
        double root1 = (-b +  squareMatrixResult) / (2*a);
        double root2 = (-b -  squareMatrixResult) / (2*a);
        return new Roots(root1, root2);
    }

    public static void main(String[] args) {
        Roots roots = QuadraticEquation.findRoots(2, 10, 8);
        System.out.println("misc.Roots: " + roots.x1 + ", " + roots.x2);
    }
}

class Roots {
    public final double x1, x2;

    public Roots(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }
}
