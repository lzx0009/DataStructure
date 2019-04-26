package practice;


public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
    public ListNode next(){
        return this.next;
    }
    public int getData(){
        return this.val;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    public ListNode append(ListNode next){
        ListNode currentNode = this;
        while (true){
            ListNode tepNode=currentNode.next;
            if(tepNode==null){
                break;
            }
            currentNode=tepNode;
        }
        currentNode.next=next;
        return this;
    }

    public ListNode FindKthToTail(ListNode head,int k) {

            int length = 1;
            ListNode currentNode = null;
            ListNode tepNode = head;

            while(true){
                currentNode=head.next;
                if(currentNode==null){
                    break;
                }
                length++;
                head=currentNode;
            }
            for(int i=length-k;i>=0;i--) {
                currentNode=tepNode.next;
                tepNode=tepNode.next;
            }
            return currentNode;
        }
    }

