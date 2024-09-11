public class LoopFigure {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        for (int line = 1; line <= SIZE; line++) {
            // contents of each line
            // print (-4 * line + 20) slashes /
            for (int slash = 1; slash <= (-4 * line + 4 * SIZE); slash++) {
                System.out.print("/");
            }
            // * print ( 8 * line - 8 stars *
            for (int star = 1; star <= ( 8 * line - 8); star++) {
                System.out.print("*");
            }
            // \
            for (int slash = 1; slash <= (-4 * line + 4 * SIZE); slash++) {
                System.out.print("\\");
        }
        System.out.println(); //end the line
            }
    }
}
