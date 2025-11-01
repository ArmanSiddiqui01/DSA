package linkedlist;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
    void length(Node a){
        Node temp=a;
        int count=0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println(count);
    }
    void usingFor(Node a){
        Node temp = a;
        for (int i = 1; i <= 5; i++) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    void head(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void display(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    void recursion(Node head){
        if(head==null) return;
        System.out.print(head.data+" ");
        recursion(head.next);
    }
}
public class LikeList  {
    public static void main(String[] args) {
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        
        a.display(a);
        System.out.println();
        a.recursion(a);
        System.out.println();
        a.head(a);
        System.out.println();
        a.usingFor(a);
        System.out.println();
        a.length(a);


    }

}
