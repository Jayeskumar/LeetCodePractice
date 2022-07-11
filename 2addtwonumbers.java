class AddTwoNumbers{
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum/10;
            temp.next=new(su ListNodem%10);
            temp=temp.next;
        }
        return dummy.next;
    }
    //time complexity O(max(l1,l2))
    //space complexity O(1)
}