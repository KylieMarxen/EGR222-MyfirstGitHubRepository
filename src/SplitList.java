import java.util.*;

public class SplitList {

    public static void main(String[] args) {
        int[] list1 = {2, 4, 6, 8};
        test(list1);
        int[] list2 = {4, 5, 7};
        test(list2);
        int[] list3 = {18, 7, 4, 24, 11};
        test(list3);
        int[] list4 = {-8, 0, -3, 2001 };
        test(list4);
        int[] list5 = {42};
        test(list5);
        int[] list6 = {17};
        test(list6);
        int[] list7 = { };
        test (list7);
    }

    public static void test(int[] data) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int n: data){
            list.add(n);
        }
        System.out.println("splitting: " + list);
        split(list);
        System.out.println("result: " + list);
        System.out.println();
    }
    public static void split( ArrayList<Integer> list) {
        for(int i = 0; i < list.size(); i+=2){
            int n = list.get(i);
            list.set(i, n/2 + n%2);
            list.add(i + 1, n/2);
        }
    }
}

