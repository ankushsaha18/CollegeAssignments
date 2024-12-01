package Lab7;

public class Stack {
    private int[] arr;
    private int n;
    private int top;
    public Stack(int n){
        arr = new int[n];
        this.n = n;
        this.top = -1;
    }
    private boolean isFull(){
        return top == n-1;
    }
    private boolean isEmpty(){
        return top == -1;
    }
    public void push(int e){
        if(isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top] = e;
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return;
        }
        top--;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr[top];
    }
    public void display(){
        for(int i = top ; i >= 0 ; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(5);
        s.push(7);
        s.push(9);
        s.display();
        System.out.println(s.peek());
        s.pop();
        s.display();
    }
}
