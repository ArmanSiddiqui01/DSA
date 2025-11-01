package recursion;

public class Solution {
    int binarySearch(int[] arr, int tar, int li, int hi) {
        if (li <= hi) {
            int mid = (li + hi) / 2;
            if (arr[mid] == tar) {
                return tar;
            } else if (arr[mid] < tar) {
                return binarySearch(arr, tar, mid + 1, hi);
            } else {
                return binarySearch(arr, tar, li, mid - 1);
            }
        }
        return -1;
    }

    void subset(String p, String up) {
        if (up.isEmpty()) {
            System.out.println("."+p);
            return;
        }

        char s = up.charAt(0);
        subset(p + s, up.substring(1));
        subset(p, up.substring(1));
    }

    public static void main(String[] args) {
        Solution s = new Solution();
//        int[] arr = {2, 3, 5, 6, 8};
//        int tar = 5;
//        int li = 0, hi = arr.length - 1;
//        int sh = s.binarySearch(arr, tar, li, hi);
//        System.out.println(sh);
        s.subset("","abc");

    }
}
