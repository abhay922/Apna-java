import java.util.ArrayList;
class stackUsingLinkedL
{
    static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    static class Stack
    {
        static Node head = null;
        public static boolean isEmpty()
        {
            return head == null;
        }
        //push
        public static void push(int data)
        {
            // we have to add a new node at top
            Node newNode = new Node(data);
            if(isEmpty())
            {
                head = newNode;
                return;
            }
            
            newNode.next = head;
            head = newNode;
            //System.out.println(data + " pushed to the stack");
        }
        //pop - delete the top element of the list
        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int val = head.data;
            head = head.next;
            //System.out.println(val + "cpopped from the stack");
            return val;
        }
        //peek -- return the top element of the list
        public int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        // s.pop();
        while(!s.isEmpty())
        {
            System.out.println(s.peek() + " ");
            s.pop();
        }
        
    }
}