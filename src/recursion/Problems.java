package recursion;

public class Problems {
    int countOfDigits(int n){
        if(n>=0&&n<=9){
            return 1;
        }
        return 1+countOfDigits(n/10);
    }
    int sumOfNumber(int n){
        if(n==0){ //n>=0&&n<=9
            return n;
        }
        return n%10+sumOfNumber(n/10);
    }
    int powMethod2(int a,int b){
        if(b==0) return 1;
        int call=powMethod2(a,b/2);
        if(b%2==0) return call*call;
        else return a*call*call;
    }
    int powMethod1(int a,int b){
        if(b==0){
            return 1;
        }
        return a*powMethod1(a,b-1);
    }
    int N_fact(int n){
        if(n==0){
            return 1;
        }
        return n*N_fact(n-1);
    }
    int SumN(int n){
        if(n==1){
            return 1;
        }
        return n+SumN(n-1);
    }
    int Fibonacci(int n){
        if(n==1||n==0){
            return n;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
    boolean isSorted(int n){
        int[] a={2,3,4,5,6};
        if(n==1||n==0){
            return true;
        }
        return a[n-1]>=a[n-2]&&isSorted(n-1);
    }
    int print(int n){
        if(n==0){
            return 1;
        }
        System.out.println(n);
        return print(n-1);
    }
    void reverse(){
        int n=523,h=0;
        while(n>0){
            h=h*10+n%10;
            n=n/10;
        }
        System.out.println(h);
    }
    void reverseRecursion(int n,int r){
        if(n==0){
            System.out.println(r);
            return;
        }
        reverseRecursion(n/10,r*10+n%10);
    }
    int reverseRecursionInt(int n,int r){
        if(n==0){
            return r;
        }
        return reverseRecursionInt(n/10,r*10+n%10);
    }

    public static void main(String[] args) {
        Problems p=new Problems();
        System.out.println(p.countOfDigits(3455));
        System.out.println(p.sumOfNumber(1));
        p.reverseRecursion(625,0);
        System.out.println(p.reverseRecursionInt(690,0));

        p.reverse();
        p.print(5);
        int sum=p.N_fact(4);
        System.out.println(sum);
        int nam=p.SumN(3);
        System.out.println(nam);
        int f=p.Fibonacci(5);
        System.out.println(f);
        System.out.println(p.isSorted(5));
        System.out.println(p.powMethod1(2,2));
        System.out.println(p.powMethod2(2,4));
    }
}
