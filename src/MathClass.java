public class MathClass {
    public static void main(String[] args) {

        double x = 3.33, y = 7, a = 88.554, b = 11.78, h = -4.5;

        double z = Math.max(x, y), c = Math.min(a, b);
        double e, d;

        e = Math.abs(h);

        d = Math.sqrt(y);




        System.out.println("Max number from 3.33 to 7 is " + z);
        System.out.println("Min number from 88.554 to 11.78 is " + c);
        System.out.println();

        System.out.println("The absolute value -4.5 is " + e);
        System.out.println();

        System.out.println("The square root 7 is " + d);
        System.out.println();

        System.out.println("Round off for 88.554: " + Math.round(a));
        System.out.println("Round off for 11.78: " + Math.round(b));
        System.out.println();

        System.out.println("Ceiling of 3.33: " + Math.ceil(x));
        System.out.println("Floor of 3.33: " + Math.floor(x));
        System.out.println();

        System.out.println("Ceiling of 11.78: " + Math.ceil(b));
        System.out.println("Floor of 11.78: " + Math.floor(b));
    }
}
