class Stack{
    int max_size;
    int array[];
    int top;
    
    public Stack(int max_size){
        this.max_size = max_size;
        array = new int[max_size];
        this.top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == max_size-1;
    }

    public void push(int data){
        if(isFull()){
            System.out.println("Stack is full!, Cannot insert an element");
        }else{
            array[++top] = data;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty!, Cannot remove an element");
            return -1;
        }
        else{
            return array[top--];
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        else{
            return array[top];
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        for(int a=top; a>=0; a--){
            System.out.print(array[a] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Stack stack1 = new Stack(5);

        System.out.println(stack1.isEmpty());
        System.out.println(stack1.isFull());

        stack1.push(10);
        stack1.push(15);
        stack1.push(5);
        stack1.push(35);

        System.out.print("After push : ");
        stack1.display();

        stack1.pop();
        stack1.pop();
        System.out.print("After pop : ");
        stack1.display();
        System.out.println("Peek is " + stack1.peek());
    }

}