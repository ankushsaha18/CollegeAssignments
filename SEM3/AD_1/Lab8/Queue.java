package Lab8;

public class Queue {
    private int front;
    private int rear;
    private int size;
    private int[] Q;
    Queue(int n){
        size = n;
        front = -1;
        rear = -1;
        Q = new int[n];
    }
    private boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    private boolean isFull(){
        return rear == size-1;
    }
    public void enQueue(int x){
        if(isFull()){
            System.out.println("Overflow");
            return;
        }else if (isEmpty()){
            front++;
            rear++;
            Q[rear] = x;
            return;
        }else{
            rear++;
            Q[rear] = x;
        }
    }
    public int deQueue(){
        if(isEmpty()){
            System.out.println("Underflow");
            return -1;
        }
        int del = Q[front];
        front++;
        if(front > rear){
            front = -1;
            rear = -1;
        }
        return del;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Underflow");
            return -1;
        }
        return Q[front];
    }
    public void display(){
        for (int i = front ; i <= rear ; i++){
            System.out.print(Q[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enQueue(50);
        q.enQueue(8);
        q.enQueue(20);
        q.enQueue(75);
        q.enQueue(41);
        q.display();
        q.enQueue(78);
        System.out.println(q.deQueue());
        System.out.println(q.peek());
        q.display();
    }
}
