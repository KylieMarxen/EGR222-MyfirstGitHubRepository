import java.util.*;

public class ArrayUnique {
    public static void main(String[] args) {
        int[] list1 = {5,7, 7, 7, 8, 22, 22, 31, 35, 35, 40, 40, 40, 41};
        test (list1);
        int[] list2 = {1, 2, 11, 17, 19, 23, 24, 25, 31, 34, 40, 41};
        test (list2);
        int[] list3 = {1,1,1,1,2,2,2,2,3,3,3,3,};
        test (list3);
        int[] list4 = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        test (list4);
        int[] list5 = {84};
        test (list5);
        int[] list6 = {42, 42, 42, 42, 42, 42, 42, 42, 42};
        test (list6);
        int [] list7 = { };
        test (list7);
    }
    public static void test (int[] list) {
        System.out.println("Testing" + Arrays.toString(list));
        System.out.println("    length = " + list.length);
        System.out.println("    unique = " + numUnique(list));
        System.out.println();
    }

    public static int numUnique(int[] list) {
        if(list.length == 0){
            return 0;
        } else {
            int count = 1;
            for (int i = 1; i < list.length; i++) {
                if (list[i] != list[i - 1]) {
                    count++;
                }
            }
            return count;
        }
    }
}
