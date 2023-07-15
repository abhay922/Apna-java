class llPracticePrb
{
    public static class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    private static void printLinkedList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void skipMdeleteN(Node head,int m,int n)
    {
        Node curr = head;
        int count;
        while(curr != null)
        {
            for(count=1; count<m; count++)
            {
                curr = curr.next;
            }
            if(curr == null)
            {
                return;
            }
            Node temp = curr.next; // because we run loop til <m
            //agar curr zero nhii hai to delete krenge
            for(count=1; count<=n && temp != null; count++)
            {
                temp = temp.next;
            }
            curr.next = temp;
            curr = temp;

        }
    }
    public static void main(String args[])
    {
        Node head = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);
        Node node6 = new Node(7);
        Node node7 = new Node(8);
        Node node8 = new Node(9);
        Node node9 = new Node(10);

        //create connection
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        skipMdeleteN(head, 3, 2);
        printLinkedList(head);
    }
}