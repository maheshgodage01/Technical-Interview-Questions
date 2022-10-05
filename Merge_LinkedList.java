import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}


public class Merge_LinkedList {
    Node head;
    public void add(Node node){
        if(head==null){
            head=node;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
    }
    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Merge_LinkedList list1 = new Merge_LinkedList();
        Merge_LinkedList list2 = new Merge_LinkedList();

        System.out.print("Length of First Sorted List:");
        int l1=input.nextInt();
    
        for(int i=0;i<l1;i++){
            list1.add(new Node(input.nextInt()));
        }
        // list1.printList();

        System.out.print("Length of Second Sorted List:");
        int l2=input.nextInt();
    
        for(int i=0;i<l2;i++){
            list2.add(new Node(input.nextInt()));
        }
        // list2.printList();

        merge_list mlist1 = new merge_list();
        Merge_LinkedList list3 = new Merge_LinkedList();
        list3.head=mlist1.merge(list1.head, list2.head);
        list3.printList();


    }
}

class merge_list{
    // Node Head;
    // Node Temp=Head;

    Node merge(Node h1, Node h2){
        Node Head=new Node(0);
        Node Temp=Head;
        // if(h1==null){
        //     Head=h2;
        //     return Head;
        // }
        // if(h2==null){
        //     Head=h1;
        //     return Head;
        // }
        // Node t1=h1;
        // Node t2=h2;
        while(true){
            if(h1==null){
                Temp.next=h2;
                break;
            }
            if(h2==null){
                Temp.next=h1;
                break;
            }

            if(h1.data<=h2.data){
                Temp.next=h1;
                h1=h1.next;
            }
            else{
                Temp.next=h2;
                h2=h2.next;
            }
            Temp=Temp.next;
        }
        return Head.next;
    }


}
