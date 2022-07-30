package pt2_Fcn;

public class SquareAr {
    /*
    Invoke a fcn calcSquareAr from the main class method
     */

    public static void main(String[] args) {
        double x = 7;
        double ar = calcSquareAr(x);
        System.out.println(ar);
        System.out.println(String.format("Square with side of: %s, has Ar: %s",
                x,
                calcSquareAr(x)));
    }

    public static double calcSquareAr(double x){
        return x*x;
    }
}
