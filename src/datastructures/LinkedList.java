package datastructures;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {

    Node head;

    void appendToTail(int d){
        Node end = new Node(d);
        Node n = head;

        if(head == null)
            head = n;

        while(n !=null){
            n = n.next;
        }
        n.next = end;
    }


    public class Node{
        Node next = null;
        int data;

        public Node(int d){
            data = d;
        }

        public Node remove(int d){
            Node n = head;

            while(n.next != null && n.next.next !=null){
                if(n.next.data == data){
                   n.next = n.next.next;
                }
                n = n.next;
            }
            return head;
        }

        public  void removeDuplicates(Node head){
            Set<Integer> set = new HashSet<Integer>();

            Node n = head;

            while(n != null && n.next !=null){
                if(set.contains(n.next.data)){
                    n.next = n.next.next;
                }else{
                    set.add(n.data);
                }
            }
        }



    }
}
