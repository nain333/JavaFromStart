package LinkedList;

import java.util.Scanner;



public class LinkListUse {
    public static Node<Integer> createLinkedList(){
        Node<Integer> n = new Node<>(10);
        Node<Integer> n2= new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        n.next=n2;
        n2.next=n3;
        return n;

    }
    public static void main(String[] args) {
        Node<Integer> head =takeInputOptimally();


//        Node<Integer> n = new Node<>(10);
//        System.out.println(n);
//        System.out.println(n.data);
//        System.out.println(n.next);
        print(head);
//        System.out.println(length(head));
//        printIthNodde(head,2);
    }
    public static void print(Node<Integer> head){
        Node<Integer> temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
    public static void increament(Node<Integer> head){
        head.data++;
    }
    public static int length(Node<Integer> head){
        int count =0;
        Node<Integer> temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;

        }
        return count;
    }
    public static void printIthNodde(Node<Integer> head,int i){
        Node<Integer> temp = head;
        int  count =0;
        while(temp!=null&&count<=i){
            if(count==i) {
                System.out.println(temp.data);
            }
            count++;
            temp=temp.next;
        }


    }
    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = null;
        int data = sc.nextInt();
        while(data!=-1){

            Node<Integer> currentNode= new Node<>(data);
            if (head==null){
//                make this node as head.
                head=currentNode;

            }
            else {
                Node<Integer> tail=head;
                while(tail.next!=null){
                    tail=tail.next;
                }
//                now tail will refer to the last node.
//                connect current node after the last node
                tail.next=currentNode;

            }
            data=sc.nextInt();
        }

        return head;
//        The time complexity is O(n^2)
    }
    public static Node<Integer> takeInputOptimally(){
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = null,tail=null;
        int data = sc.nextInt();
        while(data!=-1){
            Node<Integer> currneNode=new Node<>(data);
            if (head==null){
//                make currentNode=head
//                make currentNode=tail
                head=currneNode;
                tail=currneNode;
            }
            else{
                tail.next=currneNode;
                tail=currneNode;
            }
            data=sc.nextInt();


        }
        return head;


    }

}
