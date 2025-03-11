/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queuearray;

/**
 *
 * @author Sifiso
 */
public class QueueArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Queue queue = new Queue(5);
        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.printQueue();  // Output: Queue: 10 20 30
        
        System.out.println("Dequeued: " + queue.dequeue());  // Output: Dequeued: 10
        queue.printQueue();  // Output: Queue: 20 30
        
        System.out.println("Front Element: " + queue.peek());  // Output: 20
        
        
    }
    
}
