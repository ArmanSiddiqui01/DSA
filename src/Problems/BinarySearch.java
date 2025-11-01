package Problems;

import java.util.Scanner;

public class BinarySearch {
    void binarySearch(){
        int[] arr={1,2,4,6,7,4,3};
        Scanner sc=new Scanner(System.in);
        int find=sc.nextInt();
        int a=0;
        int b=arr.length-1;
        int c=a+b/2;
        while(a<=b){
            if(arr[c]==find){
                System.out.println("present at: "+c);
                break;
            }else if(arr[c]<find){
                a=arr[c]+1;
            }else{
                b=arr[c]-1;
            }
            c=a+b/2;
        }
        System.out.println(c);

    }
    void twoSum(int[] arr,int tar){
        int left = 0;
        int right = arr.length - 1;
        boolean found = false;
        while (left < right) {
            if (arr[right] + arr[left] == tar) {
                System.out.println(right + " " + left);
                right--;
                left++;
                found = true;
//                break;
            } else if (tar < arr[right] + arr[left]) {
                right--;
            } else {
                left++;
            }
        }
        if (!found) {
            System.out.println("not found");
        }
    }

    public void isPalindrome(int x) {
        String str = Integer.toString(x);
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                System.out.println("true");
            }
            left++;
            right--;
        }
        System.out.println("false");
    }

    public static void main(String[] args) {
        BinarySearch b=new BinarySearch();
        int[] arr={1,2,3,4,5};
        int tar=6;
        b.twoSum(arr,tar);
        b.binarySearch();
        b.isPalindrome(121);

    }
}
