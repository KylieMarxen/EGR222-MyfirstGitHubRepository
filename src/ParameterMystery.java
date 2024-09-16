public class ParameterMystery {
    public static void main(String[] args) {
        int x = 9;
        String y =  "x";
        int z = 2;

        mystery(x,y,z);
        System.out.println(x + " " + y + " " + z);
        mystery(z, "y", x);
        mystery(x + 3, y + z, x + z);
    }
    public static void mystery(int x, String z, int y) {
        x++;
        y--;
        System.out.println(z + " " + y + " " + x);
    }
}
