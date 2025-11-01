package Problems;

public class TwoSum {
    void BruteForce(){
        int[] a={5,2,11,7,15};
        int tar=9;
        for(int i=0;i<a.length;i++){
            int first=a[i];
            for(int j=i+1;j<a.length;j++){
                int second=a[j];
                int sum=first+second;
                if(sum==tar){
                    System.out.println(i + " " +j);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        TwoSum ts=new TwoSum();
        ts.BruteForce();
    }
    void Better(){

    }

}
