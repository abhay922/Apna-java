import java.net.SocketTimeoutException;

class LinkedList
{
    public static class Node
    {
        int  data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //Add at first Node
    public void AddFirst(int data) // O(1) constant time
    {
        //step1 = create new node
        Node newNode = new Node(data);
        size++;
        //when list is empty
        if(head == null)
        {
            head = tail = newNode;
            return;
        }

        //step2 - newNode next = head
        newNode.next = head; //linking step

        //step3 - head = newNode
        head = newNode;
    }

    //add at last node
    public void AddLast(int data)
    {
        //step1 create newNode
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
        }
        //step2  tail.next = newNode
        tail.next = newNode;
        //step3 tail = newNode
        tail = newNode;
    }

    public void AddInMid(int idx,int data)
    {
        if(idx == 0)
        {
            AddFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<idx-1)
        {
            temp = temp.next;
            i++;
        }
        //when i = idx-1   means temp->prev
        newNode.next = temp.next;
        temp.next = newNode;


    }

    public int removeFirst()
    {
        if(size == 0)
        {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        //Node temp = head;
        int val = head.data;
        head = head.next;
        size--; 
        return val;
    }

    public int removeLast()
    {
        if(size == 0)
        {
            System.out.println("List is empty,there is no element which we can delete");
            return Integer.MIN_VALUE;
        }
        else if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //find prev node i = size-2
        Node prev = head;
        for(int i=0; i<size-2; i++)
        {
            prev = prev.next;
        }
        int val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev; // assign value of prev in tail
        size--;
        return val;

    }

    public int searchIterative(int key)
    {
        Node temp = head;
        for(int i=0; i<size; i++)
        {
            if(temp.data == key)
            {
                return i;
            }
            temp = temp.next;

        }
        return -1;
    }

    //Search(Recursive)
    public int helper(Node  head,int key) //O(n) both time space comp
    {
        if(head == null)
        {
            return -1;
        }
        if(head.data == key)
        {
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1)
        {
            return -1;
        }
        return idx+1;

    }
    public int recursiveSearch(int key)
    {
        return helper(head,key);
    }

    //Step for reverse a linklist ITERATIVE APPROACH
    //  need curr,prev and next,
    /*repeat until while(curr != null)
    i) next = curr.next
    ii) curr.next = prev
    iii) prev = curr
    iv) curr = next */
    public void reverse() // O(n)
    {
        //Node temp = head;
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }


    //FIND & REMOVE Nth NODE FROM THE END
    public void deleteNthFromEnd(int n)
    {
        //calculate size 
        int sz=0;
        Node temp = head;
        while(temp != null)
        {
            temp = temp.next;
            sz++;
        }
        if(n == sz)
        {
            head = head.next; // remove first
            return;
        }
        //sz-n  we have to find the index sz-n
        int i=1;
        Node prev = head;
        int iToFind = sz-n;
        while(i<iToFind)
        {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    // function to find mid node using SLOW-FAST APPRAOCH
    public Node findMid(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null) // for even and odd both types of size
        {
            slow = slow.next; //+1
            fast =  fast.next.next; // +2
        }
        return slow; // slow is midNode
    }

    //Check if ll is a palindrome
    public boolean isPalindrome() // slow-fast pointer technique
    {
        if(head == null || head.next == null)
        {
            return true;
        }
       // step1 find mid
       //step 2 reverse 2nd half
       // check left half & right half

        //step1
       Node midNode = findMid(head);
       //step2
       Node prev = null;
       Node curr = midNode;
       Node next; 
       while(curr != null)
       {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
       }
       Node right = prev; //right half ka head
       Node left = head; // left half ka head

       //step3
       while(right != null)
       {
            if(left.data != right.data)
            {
                return false;
            }
            left = left.next;
            right = right.next;
       }
       return true;
    } 





    public void printList()  //O(n)
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp  != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");

    }


    //function for get mid 
    private Node getMid(Node head)
    {
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null)
        {
            slow =  slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //function for merge
    private Node merge(Node head1,Node head2)
    {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL; // temp variable is pointing towards mergedLL's head
        while(head1 != null && head2 != null)
        {
            if(head1.data <= head2.data)
            {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else
            {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null)
            {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
        while(head2 != null)
            {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        return mergedLL.next;
    }
    public Node mergeSort(Node head)
    {
        //base case
        if(head == null || head.next == null)
        {
            return head;
        }
        //find mid
        Node mid = getMid(head);
        //left and right MergeSort
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft,newRight);
    }

    // Rorder the list
    public void zigzag()
    {
        //step1 find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //step2 reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node leftH = head;
        Node rightH = prev;
        Node nextL,nextR;

        //step3 alternate merge or zig zag merge
        while(leftH != null && rightH != null)
        {
            nextL = leftH.next;
            leftH.next = rightH;
            nextR = rightH.next;
            rightH.next = nextL;

            leftH = nextL;
            rightH = nextR;
        }
        
    }





    public static void main(String args[])
    {
        LinkedList ll = new LinkedList();
        //ll.printList();
        //ll.removeFirst();
        ll.AddFirst(1);
        ll.AddFirst(2);
        //ll.AddLast(3);
        //ll.AddLast(4);
        ///ll.AddInMid(2,9);
        ll.AddFirst(3);
        ll.AddFirst(4);
        ll.AddFirst(5);
        ll.AddFirst(7);
        ll.printList();
        ll.zigzag();
        ll.printList();
        //ll.head = ll.mergeSort(ll.head);
        //ll.printList();
        //ll.reverse();
        //ll.printList();
        //ll.deleteNthFromEnd(3);
        // ll.removeFirst();
        //ll.printList();
        // ll.removeLast();
        // ll.printList();
        //System.out.println(ll.searchIterative(88));
        // System.out.println(ll.recursiveSearch(9));
        // System.out.println(ll.recursiveSearch(23));
        //System.out.println(ll.isPalindrome());
        System.out.println(size);

    }
}