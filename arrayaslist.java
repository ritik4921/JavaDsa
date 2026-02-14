public class arrayaslist {
    int arr[];
    int size;
    int idx;
    public arrayaslist(int capacity){
        this.size=capacity;
        this.arr=new int[size];
        this.idx=-1;
    }
    public void addatlast(int data){
        if(this.size-1== this.idx){
            System.out.println("list is full");
            return;
        }else{
            this.idx++;
           this.arr[this.idx]=data;
        }

    }

    public void addatbegin(int data){
        if(this.size-1==this.idx){
            System.out.println("array is full");
            return;
        }
        else{
            this.idx++;
            for(int i=this.idx; i>0; i--){
                this.arr[i]=this.arr[i-1];
            }
            this.arr[0]=data;


        }
    }

    public void addatposition(int data,int pos){
        if(this.size -1 ==idx){
            System.out.println("array is full");
            return;
        }else{
            this.idx++;
            for(int i=this.idx; i>pos-1;i--){
                this.arr[i]=this.arr[i-1];
            }
            arr[pos-1]=data;
        }
    }
    public void searchatpos(int key){
    if(this.idx == -1){
        System.out.println("Array is empty");
        return;
    }

    for(int i = 0; i <= idx; i++){
        if(arr[i] == key){
            System.out.println("Element found at index: " + i);
            return;
        }
    }

    System.out.println("Element not found");
}

public void deletefromend(){
    if(this.idx==-1){
        System.out.println("array is empty");
        return;
    }else{
        idx--;
    }
}
public void deletefrombegin(){
    if(this.idx==-1){
        System.out.println("array is empty");
        return;

    }else{
        for(int i=0; i<=idx; i++){
            arr[i]=arr[i+1];
        
        }
        this.idx--;
    }
}
public void deletefrompos(int pos ){
    if(this.idx==-1){
        System.out.println("array is empty");
        return;
    }else{
        for(int i=pos-1; i<=this.idx-1; i++){
            arr[i]=arr[i+1];

        }
        this.idx--;
    }
}

    public void display(){
        if(this.idx==-1){
            System.out.println("array is empty");
            return;
        }
        else{
            for(int i=0; i<=idx; i++){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        arrayaslist i=new arrayaslist(4);
       i.addatbegin(90);
       i.addatbegin(80);
       i.addatbegin(60);
       i.display();
       i.addatposition(77,3);
       System.out.println("--------------------------------");
       i.display();
       System.out.println("--------------------------------");
       i.searchatpos(60);
        System.out.println("--------------------------------");
        // i.deletefromend();
        // i.display();
        //  System.out.println("--------------------------------");
        //  i.deletefrombegin();
        //  i.display();
        i.deletefrompos(2);
        i.display();

       
       
    }

    
}
