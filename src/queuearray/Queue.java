/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queuearray;

/**
 *
 * @author Sifiso
 */
public class Queue {
  private int[] queue;
  private int front,rear,size,capacty;

    public Queue( int capacty) {
        this.capacty = capacty;
        this.queue=new int[capacty];
        this.front=0;
        this.rear=-1;
        this.size=0;
    }
  
    public boolean isfull(){
        return size ==capacty;
    }
    public boolean isEmpty(){
        return size ==0;
    }
  public void enqueue(int item){
      if(isfull()){
          System.out.println("Queue is full!Cannot enqueue "+item);
          return;
      }
      rear = (rear+1)%capacty;
      queue[rear]=item;
      size++;
      System.out.println("Enqueued: "+item);     
  }
  
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty! Cannot dequeue.");
        }
        int item = queue[front];
        front = (front + 1) % capacty;  // Circular increment
        size--;
        return item;
    }
     public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty! Cannot peek.");
        }
        return queue[front];
    }
      public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacty] + " ");
        }
        System.out.println();
    }
}
