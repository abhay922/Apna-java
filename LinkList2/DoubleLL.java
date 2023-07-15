class DoubleLL
{
    public class Node
    {
        int data;
        Node next;
        Node prev;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


    //Add first
    public void AddFirst(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //remove
    public int RemoveFirst()
    {
        if(head == null)
        {
            System.out.println("cant delete cause link is empty");
            return Integer.MIN_VALUE;
        }

        if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size--;
            return val;

        }

        int val = head.data;
        //head.next = head;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    //AddLast
    public void AddLast(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    //RemoveLast


    //revese doublell
    public void reverse() // 3 var 5 step
    {
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            curr.prev = next; // this is the extra statement
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data +"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[])
    {
        DoubleLL dll = new DoubleLL();
        dll.AddFirst(3);
        dll.AddFirst(2);
        dll.AddFirst(1);
        dll.AddFirst(4);
        
        dll.print();
        //dll.AddLast(5);
        // dll.RemoveFirst();
        dll.reverse();
        
        dll.print();
       // System.out.println("Size of DoubleLL is:" + size);
    }
}