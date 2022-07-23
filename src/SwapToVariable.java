public class SwapToVariable {
    public static void main(String[] args) {

        String x = "water";
        String y = "soda";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

}
