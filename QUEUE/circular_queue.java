package QUEUE;

public class circular_queue {
    static int arr[];
    static int size;
    static int rear=-1;
    static int front=-1;

    public circular_queue(int n){
        arr=new int[n];
        size=n;
    }
    public static boolean isEmpty(){
        return (rear==-1 && front==-1);
    }
    public static boolean isFull(){
        return (rear+1)%size==front;
    }
    public static void add(int data){
        if(isFull()){
            System.out.println("can't add anymore");
            return;
        }
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%size;
        arr[rear]=data;
    }
    public static int remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int data=arr[front];
        
        //if only one element that is left is now deleted
        if(rear==front){
            rear=front=-1;
        }
        else{
            front=(front+1)%size;
        }
        return data;
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("it is empty");
            return -1;
        }
        return arr[front];
    }
    public static void main(String[] args) {
        circular_queue q=new circular_queue(5);
        q.add(1);
        q.add(2);
        System.out.println(q.remove());
        q.add(3);
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
