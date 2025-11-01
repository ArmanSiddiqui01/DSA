package array;

import java.util.Scanner;

public class KthLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={2,4,6,8,9,10};
        int k=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
            if(i==k-1){
                System.out.println(k+" largest number is: "+arr[i]);
                break; //TO STOP SORTING ALGORITHM OR K-1 IS FOR INDEX IS 4-1=3 THAT IS 4TH POSITION
            }
        }
        System.out.println("--------------------");
        for(int l:arr){
            System.out.print(" "+l);
        }
    }
}
