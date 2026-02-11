 class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
    public class link{
        Node head;
        void addNodeAtBegin(int data){
            Node newNode = new Node(data);
            if(this.head==null){
                this.head=newNode;
                return;
            }else{
                newNode.next=this.head;
                head=newNode;
            }
        }
        void display(){
            if(head==null){
                System.out.println("list is empty");
            }else{
                Node temp=head;
                while(temp!=null){
                    System.out.println(temp.data);
                    temp=temp.next;
                }
            }
        }
    
        public static void main(String[] args) {
            link l=new link();
            l.addNodeAtBegin( 10);
            l.addNodeAtBegin( 20);
            l.addNodeAtBegin( 30);

            l.display();
            
        }
    }
    

