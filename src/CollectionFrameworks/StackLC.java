package CollectionFrameworks;

import java.util.Stack;

public class StackLC {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(0);
        s.push(2);
        s.push(2);
        System.out.println(s);
        System.out.println(s.peek());//FILO
        System.out.println(s.pop());//last is deleted
        System.out.println(s);
        System.out.println(s.search(2));
        System.out.println(s.empty());//check boolean
        System.out.println(s.search(9));// Not present than return -1
        for(Integer i:s){
            System.out.println(i);
        }

    }
}
