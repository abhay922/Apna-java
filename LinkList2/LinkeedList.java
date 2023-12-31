class LinkeedList
{
    public static boolean isCycle()
    {
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next;
            if(fast == slow)
            {
                return true; //cycle exits
            }
        }
        return false;
    }



    public static void main(String args[])
    {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        // 1->2->3->1
        System.out.println(isCycle());
    }
}