public class arraySimulation {

    public static void main(String[] args) {

    }
    public static void mystery(int [] list) {
        for (int i = 1; i < list.length; i++) {
            list [i] = list [i] + list [i - 1];
            /*
            original list:           Final list:
            [6,3]                    [6,9]
            [2,4,6]                  [8]
            [1,2,3,4]                [1,3,6,10]
            [7,3,2,0,5]              [7,10,12,12,17]
             */
        }
    }
}
