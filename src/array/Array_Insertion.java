package array;

public class Array_Insertion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int indexPos = 2;
        int element = 100;
        //1
        int[] newar = new int[arr.length + 1];
        //2
        for (int i = 0; i < indexPos; i++) {
            newar[i] = arr[i];
        }
        //3
        newar[indexPos] = element;
        //4
        for (int i = indexPos; i < arr.length; i++) {
            newar[i + 1] = arr[i];
        }
        //5 traverse
        for (int i = 0; i < newar.length; i++) {
            System.out.print(" " + newar[i]);
        }
    }
}
