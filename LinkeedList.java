class LinkeedList
{
    //static Node head;
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
    //public static int size;
    public static boolean isCycle()
    {
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow)
            {
                return true; //cycle exits
            }
        }
        return false;
    }
    //detect cycle,slow = head,prev = 
    public static void removeCycle()
    {
        // step 1 detect cycle
        //find meeting point
        //remove cycle -> last.next = null
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast !=null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                cycle = true;
                break;
            }
        }
        if(cycle == false)
        {
            return;
        }
        slow = head;
        Node prev = null;
        while(slow != fast)
        {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //here we removing cycle -> prev.next = null
        prev.next = null;
    }





    public static void main(String args[])
    {
        //LinkedList list = new LinkedList(); // Create an instance of LinkedList
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = head.next; // Create a cycle: 1->2->3->1
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());


    }
}



 




