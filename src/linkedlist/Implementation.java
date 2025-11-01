package linkedlist;

public class Implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data ){
            this.data=data;
        }
    }
    public static class LinkedList{
        Node head;
        Node tail;
        void insertAtEnd(int val){
            Node New=new Node(val);
            if(head==null) {
                head=New;
            }else{
                tail.next=New;
            }
            tail=New;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        int size(){
            Node temp=head;
            int count=0;
            while (temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        void insertAtHead(int val){
            Node temp=new Node(val);
            if(head==null){
                head=tail=temp;
            }else{
                temp.next=head;
                head=temp;
            }
        }


    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insertAtEnd(5);
        ll.insertAtEnd(3);
        ll.display();
        System.out.println();
        System.out.println(ll.size());
        ll.insertAtHead(6);
        ll.display();
    }
}
