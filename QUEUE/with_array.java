package QUEUE;

public class with_array {
    static int arr[];
    static int size;
    static int rear=-1;
    public with_array(int size){
        arr=new int[size];
    }
    public static boolean isEmpty(){
        return (rear==-1);
    }
    public static void add(int data){
        rear=rear+1;
        arr[rear]=data;
    }
    public static int remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int data=arr[0];
        
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear=rear-1;
        return data;

    }
    public static int peek(){
        return arr[0];
    }
    public static void main(String[] args) {
        with_array q=new with_array(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }

    }
}
