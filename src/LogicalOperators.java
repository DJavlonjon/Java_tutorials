public class LogicalOperators {
    public static void main(String[] args) {


        int x = 5;

        if (x>3 && x<10) {
            System.out.println("x>3 && x<10 is " + (x>3 && x<10));
        }
        if (x>3 || x>10) {
            System.out.println("x>3 || x>10 is " + (x>3 || x>10) );
        }
        if (!(x > 10)) {
            System.out.println("!(x > 10) is " + !(x > 10));
        }
    }
}
