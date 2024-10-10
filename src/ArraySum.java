import java.util.*;
public class ArraySum {
    public static void main(String[] args) {
        int[] list1 = {7, 8, 3, 4, 9, 2, 5, 8, 13, 7};
        test(list1);
        int[] list2 = {3, 5, 2, 9, 8, -4, 7, 6, 2, 8, 3, 1, 0, 42, 12};
        test(list2);
        int[] list3 = {1, 3, 8, 9, 5, 7, 2 };
        test(list3);
        int[] list4 = {3, 8};
        test(list4);
    }

    public static void test(int[] list) {
        System.out.println("Testing: " + Arrays.toString(list));
        System.out.println("result : " + Arrays.toString(sum5(list)));
        System.out.println();
    }
    public static int[] sum5(int[] list) {
        int[] sum = new int[5];
        for (int i = 0; i < list.length; i++) {
            sum[i % 5] += list[i];
        }

        return sum;
    }
}
