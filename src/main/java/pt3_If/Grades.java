package pt3_If;

public class Grades {
    /*
    Determine Pass or Fail if above 70%.
     */
    public static void main(String[] args) {
        double grade = 55;
        System.out.println(String.format("You passed: %s", verdict(grade)));
    }

    public static boolean verdict(double grade){
        if (grade >= 70){
            return true;
        }
        else return false;
    }
}
