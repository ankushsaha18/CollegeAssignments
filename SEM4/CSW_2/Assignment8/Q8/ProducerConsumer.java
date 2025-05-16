package Assignment8.Q8;

import java.util.LinkedList;
import java.util.Queue;

class Buffer {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity;

    public Buffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void put(int value) throws InterruptedException {
        while (queue.size() == capacity) {
            System.out.println("Buffer full. Producer waiting...");
            wait();
        }
        queue.add(value);
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized int get() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println("Buffer empty. Consumer waiting...");
            wait();
        }
        int value = queue.poll();
        System.out.println("Consumed: " + value);
        notify();
        return value;
    }
}

class Producer extends Thread {
    private final Buffer buffer;
    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.put(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Producer finished.");
    }
}

class Consumer extends Thread {
    private final Buffer buffer;
    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.get();
                Thread.sleep(1200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Consumer finished.");
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(3);
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        producer.start();
        consumer.start();
    }
}
