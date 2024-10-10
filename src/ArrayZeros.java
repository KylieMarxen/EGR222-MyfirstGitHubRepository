import java.util.*;

public class ArrayZeros {
    public static void main(String[] args) {
        int[] list1 = {1, 3, 8, 0, 19, 24, 0, 7, 2, 0 };
        test(list1);
        int [] list2 = {7, 3, 0, 4, 6, 0, 0, 13, 0, 78, 0, 0, 19, 14};
        test(list2);
        int [] list3 = {1, 2, 3, 4, 5};
        test(list3);
        int [] list4 = {1, 0, 2, 0, 0, 3, 0, 0, 0, 4, 0, 0, 0, 0};
        test(list4);
        int [] list5 = {0, 0, 8, 3, 0, 0, 0, 4, 0, 0, 0, 7, 2, 0, 0, 18};
        test(list5);
        int [] list6 = {0, 0, 0, 0};
        test(list6);
        int [] list7 = {0};
        test(list7);
        int[] list8 = { };
        test(list8);
    }
    public static void test(int[] list) {
        System.out.println("before: " + Arrays.toString(list));
        removeZeros(list);
        System.out.println("after: " + Arrays.toString(list));
        System.out.println();
    }
    public static void removeZeros(int[] list) {
        int count = 0; // how many non zero values have we seen
        for (int i = 0; i < list.length; i++) {
            if (list[i] != 0) {
                list[count] = list[i];
                count++;
            }
        }
        for (int i = count; i < list.length; i++) {
            list[i]=0;
        }
        }
    }

