//Rotate
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
       if( head == null || head.next == null){
           return head;
       }   
        ListNode curr = head;
        int n=1;
        while(curr.next != null){
            curr = curr.next;
             n++;
        }
      //  System.out.print(n);
      ListNode pre = head;
      int i =0;
      while(i<(n-k%n-1)){
          pre = pre.next;
     i++; }
        curr.next = head;
        ListNode a = pre.next;
        pre.next = null;
        head = a;


    return head; }
}


//Odd even
class Solution {
    public ListNode oddEvenList(ListNode head) {
    ListNode es=null,ee=null,os=null,oe = null;
    // es->even start  ee->even end  os->odd start  oe->odd end
    int count=0;
    ListNode curr = head;
    while(curr!=null){
            count++;
            if(count%2 != 0){  if(os==null) {os = oe = curr;}  
            else  {oe.next = curr;  oe = oe.next; } 
    }
    else{
        if(es==null){
        es = ee = curr;}
        else{
        ee.next = curr;
        ee = ee.next;
    }}
    curr = curr.next;
    }
    if(os==null || es==null)   return head;
    oe.next = es;
    ee.next = null;    
    return os;
    }
}
