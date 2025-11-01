package recursion;

public class Introduction {
    int printNatural(int n,int a){
        if(n==0){
            return a;
        }
        a=a+n;
        return printNatural(n-1,a);
    }
    int printNum(int n) {
        if (n == 1) {
            System.out.print(" " +n);
            return 1;
        }
        System.out.print(" " +n);
        return printNum(n - 1);
    }
    int fibonacci(int n){ //O(2^n)=TC or SC=O(n)
        if (n==1||n==0){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }

    int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }

    boolean isSorted(int[] a,int n){
        if (n==0||n==1){
            return true;
        }
        return a[n-1 ] > a[n - 2] && isSorted(a,n - 1);
    }

    int print(int n){
        if(n==1){
            System.out.println(n);
            return 1;
        }
        System.out.println(n);
        return print(n-1);
    }
    public static void main(String[] args) {
        Introduction i=new Introduction();
        i.print(4);
        int[] a={2,3,4,5,6};
        System.out.println(i.isSorted(a,a.length));
    }
}
