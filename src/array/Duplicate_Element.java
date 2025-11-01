package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Duplicate {
    //BRUTE FORCE METHOD
    void method1() {
        int[] a = {3, 5, 4, 3, 2, 2, 1};
        System.out.print("Duplicate elements are:");
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] && i != j) {
                    System.out.print(" " + a[j]);
                }
            }
        }
    }
    //SET INTERFACE
    void method2() {
        int[] a={3,5,4,3,2,2,1};
        System.out.print(" Duplicate element is: ");
        Set<Integer> s=new HashSet<>();
        for(int no:a){
            if(!s.add(no)){
                System.out.print(" "+no);
            }
        }
    }
    //USING HASHTABLE
    void method3(){
        int[] a={3,5,4,3,2,3,2,1};
        Map<Integer,Integer> hm=new HashMap<>();
        for(int no:a){
            Integer count=hm.get(no);
            if(count==null){
                hm.put(no,1);
            }else{
                count=count+1;
                hm.put(no,count);
            }
        }
        Set<Map.Entry<Integer,Integer>> es=hm.entrySet();
        for(Map.Entry<Integer,Integer> Me:es){
            if(Me.getValue()>1){
                System.out.print(" "+Me.getKey());
            }
        }
    }
}
public class Duplicate_Element{
    public static void main(String[] args) {
        Duplicate d=new Duplicate();
        d.method1();
        d.method2();
        d.method3();
    }
}
