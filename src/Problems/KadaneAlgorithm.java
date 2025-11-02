package Problems;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] num = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int countSum=0;
        int max=Integer.MIN_VALUE;
        for (int j : num) {
            countSum = countSum + j;
            if (countSum > max) {
                max = countSum;
            }
            if (countSum < 0) {
                countSum = 0;
            }
        }
        System.out.println(max);
    }
}
