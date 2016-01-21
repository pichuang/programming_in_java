import java.lang.*;

public class CompareTo {

    public static void main(String[] args) {

        // compares the two specified double values
//        double d1 = 15.45;
//        double d2 = 11.50;
//        int retval = Double.compare(d1, d2);
//
//        if (retval > 0) {
//            System.out.println("d1 is greater than d2");
//        } else if (retval < 0) {
//            System.out.println("d1 is less than d2");
//        } else {
//            System.out.println("d1 is equal to d2");
//        }
        System.out.println(compare(15.45, 0)); //return 1
        System.out.println(compare(-1.0, 0)); //return -1
        System.out.println(compare(-0.0, -1.0)); //return 0
        System.out.println(compare(0.01, 0)); //return 1
//        System.out.println(compare(, 0));
    }


    public static int compare(double a, double b) {
        double delta = a - b;
//        return delta < 0 ? -1 : (delta > 0 ? 1 : 0);
        return delta > 0 ? 1: (delta < 0 ? -1: 0);
    }
}
