package array;

public class Second_largest {
    void method2(int[] a){
        int secondNumber=2;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            if(i==secondNumber-1){
                System.out.println(" "+a[i]);
                break;
            }
        }
        System.out.println("____________________");
        for(int l:a){
            System.out.print(" "+l);
        }
    }
    void check(){
        int[] a={1,2,3,4,5,6};
        int b=4;
        int flag=0;
        for (int j : a) {
            if (b == j) {
                flag = 1;
                break;
            }
        }
        if(flag==1){
            System.out.println("present");
        }else{
            System.out.println("not present");
        }
    }
    void method1(int[] a){
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        for (int j : a) {
            if (j > largest) {
                second_largest = largest;
                largest = j;
            } else if (j > second_largest && j != largest) {
                second_largest = j;
            }
        }
        if(second_largest==Integer.MIN_VALUE){
            System.out.println("there is no second largest number in this list");
        }else{
            System.out.println("second largest value is "+second_largest);
        }
    }

    public static void main(String[] args) {
        Second_largest sl = new Second_largest();
        int[] a = {6, 8, 2, 4, 3, 1, 5, 7};


    }
}
