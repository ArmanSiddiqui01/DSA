package Problems;

public class SlidingWindows {
    void maxSubArray(int[] user){
        int k=3;
        int windows=0,max;
        for(int i=0;i< k;i++){
            windows=windows+user[i];
        }
        max=windows;
        int index=0;
        for(int i=1; i<user.length-k; i++){
            windows=windows-user[i-1]+user[i+k-1];
            if(max<windows){
                max=windows;
                index=i;
            }
        }
        System.out.println("Maximum subarray :"+max+" index number :"+index);
        System.out.println("-----------------------");

    }
    void slidingWindow(int[] user,String[] day){
        int days=3;
        float sumOfDays=0;
        for (int i=0;i<days;i++) {
            sumOfDays = sumOfDays + user[i];
        }
        System.out.println(day[0]);
        System.out.println("sum " +sumOfDays);
        float avg=sumOfDays/days;
        System.out.println("avg " +avg);

        for(int i=1;i<user.length-days;i++){
            sumOfDays=sumOfDays-user[i-1]+user[i+days-1];
            System.out.println("----------------");
            System.out.println(day[i]);
            System.out.println("sum " +sumOfDays);
            System.out.println("avg " +sumOfDays/days);
        }

    }
    public static void main(String[] args) {
        int[] user={100,45,56,77,55,99,66,55};
        String[] day={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday",};
        SlidingWindows s=new SlidingWindows();
        s.maxSubArray(user);
        s.slidingWindow(user,day);
    }
}