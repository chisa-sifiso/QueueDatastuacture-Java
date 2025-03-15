<!DOCTYPE html>
<html>

<body>
    <h1>Queue-Activity-Java</h1>
    <p>This repository contains a Java implementation of a Queue using an array, demonstrating circular queue behavior and basic queue operations.</p>
    
   <h2>Overview</h2>
    <p>The Queue follows the <strong>FIFO (First In, First Out)</strong> principle. This implementation uses an array with a circular approach, meaning that when the rear index reaches the end of the array, it wraps around to the beginning if there is space available.</p>
    
 <h2>Features</h2>
    <ul>
        <li><strong>Enqueue:</strong> Inserts an element at the rear of the queue.</li>
        <li><strong>Dequeue:</strong> Removes an element from the front of the queue.</li>
        <li><strong>Peek:</strong> Retrieves the front element without removing it.</li>
        <li><strong>isEmpty & isFull:</strong> Checks if the queue is empty or full.</li>
        <li><strong>Circular Array:</strong> Uses modulus arithmetic to wrap indices.</li>
    </ul>
    
 <h2>Project Structure</h2>
    <pre>
Queue-Activity-Java/
├── src/
│   ├── Queue.java
│   └── Main.java
├── README.html
└── .gitignore
    </pre>
    
<h2>Usage</h2>
    <p>Clone the repository, compile the Java source files, and run the Main class:</p>
    <pre>
git clone https://github.com/Chisa-sifiso/Queue-Activity-Java.git
cd Queue-Activity-Java/src
javac Main.java
java Main
    </pre>
    
  <h2>Code Example</h2>
    <pre>
Queue queue = new Queue(5);
queue.enqueue(10);
queue.enqueue(20);
queue.enqueue(30);
queue.printQueue(); // Output: Queue: 10 20 30
System.out.println("Dequeued: " + queue.dequeue());
queue.printQueue();
    </pre>
    <h2>License</h2>
    <p>This project is licensed under the MIT License.</p>
</body>
</html>
