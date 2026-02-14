class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class linkedlist {
    Node head;
    void addNodeatbegin(int data){
        if(this.head==null){
            this.head=new Node(data);
            return;
        }else{
            Node newNode=new Node(data);
            newNode.next=this.head;
            head=newNode;
        }
    }
    void addNodeatend(int data){
        if(this.head==null){
            this.head=new Node(data);
            return;
        }else{
            Node temp=this.head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new Node(data);
        }

    }
void addnodeatpos(int data,int pos){
    if(this.head==null){
        this.head=new Node(data);
        return;
    }else{
        Node temp=this.head;
        int cnt=0;
        while(temp.next!=null){
            if(cnt==pos-1){
                break;
            }
            temp=temp.next;
            cnt++;

        }
    Node newNode=new Node(data);
    newNode.next=temp.next;
    temp.next=newNode; 
    }

}
void display(){
    if(head==null){
        System.out.println("list is empty");
        return;
    }else{
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;


        }
    }
}
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.addNodeatbegin(10);
        list.addNodeatend(20);
        list.addnodeatpos(40, 1);
        list.display();

    }
}

