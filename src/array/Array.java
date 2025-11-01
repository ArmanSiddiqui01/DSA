package array;

import java.util.Scanner;

public class Array {
    int[] arrayInput(){
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    void maximum(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    void patterns() {
        /* * * * *
         * * * *
         * * *
         * *
         */
        for (int row = 0; row < 6; row++) {
            for(int col=5;col>row;col--) {
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
    void pattern2(){
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void pattern3(){
    }
    public static void main(String[] args) {
        Array a=new Array();
        a.pattern2();
    }
}
