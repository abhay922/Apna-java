import java.util.LinkedList;
public class Classroom //merge sort on linkedlist
{
    // //function for get mid 
    // private Node getMid(Node head)
    // {
    //     Node slow = head;
    //     Node fast = head.next;
    //     while(fast != null && fast.next != null)
    //     {
    //         slow =  slow.next;
    //         fast = fast.next.next;
    //     }
    //     return slow;
    // }

    // //function for merge
    // private Node merge(Node head1,Node head2)
    // {
    //     Node mergedLL = new Node(-1);
    //     Node temp = mergedLL; // temp variable is pointing towards mergedLL's head
    //     while(head1 != null && head2 != null)
    //     {
    //         if(head1.data <= head2.data)
    //         {
    //             temp.next = head1;
    //             head1 = head1.next;
    //             temp = temp.next;
    //         }
    //         else
    //         {
    //             temp.next = head2;
    //             head2 = head2.next;
    //             temp = temp.next;
    //         }
    //     }
    //     while(head1 != null)
    //         {
    //             temp.next = head1;
    //             head1 = head1.next;
    //             temp = temp.next;
    //         }
    //     while(head2 != null)
    //         {
    //             temp.next = head2;
    //             head2 = head2.next;
    //             temp = temp.next;
    //         }
    //     return mergedLL.next;
    // }
    // public Node mergeSort(Node head)
    // {
    //     //base case
    //     if(head == null || head.next == null)
    //     {
    //         return head;
    //     }
    //     //find mid
    //     Node mid = getMid(head);
    //     //left and right MergeSort
    //     Node rightHead = mid.next;
    //     mid.next = null;
    //     Node newLeft = mergeSort(head);
    //     Node newRight = mergeSort(rightHead);

    //     //merge
    //     return merge(newLeft,newRight);
    // }
    // public static void main(String args[])
    // {
    //     //create
    //     LinkedList ll = new LinkedList();
    //     //add
    //     ll.addFirst(1);
    //     ll.addFirst(2);
    //     ll.addFirst(3);
    //     ll.addFirst(4);
    //     ll.addFirst(5);

    //     ll.print();

    //     ll.head = ll.MergeSort(ll.head);
    //     ll.print();
    //     //System.out.println(ll);
    //     //remove
    //     // ll.removeLast();
    //     // ll.removeFirst();
    //     System.out.println(ll);

    // }
}