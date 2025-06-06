public class App {
    public static void main(String[] args) {
       Stack stack = new Stack(10);
       stack.push(1);
       stack.push(2);
       stack.push(3);
       stack.push(4);
       stack.push(5);
       stack.push(6);
       stack.push(7);
       stack.push(8);
       stack.push(9);

       System.out.println("Stack output :");
       while (!stack.isEmpty()){
           System.out.print(stack.pop() + ", ");
       }

        Queue queue = new Queue(10);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        queue.insert(7);
        queue.insert(8);
        queue.insert(9); 
        queue.insert(10);

       System.out.println("\nQueue output :");
       while (!queue.isEmpty()){
           System.out.print(queue.remove() + ", ");
       }
    }
}