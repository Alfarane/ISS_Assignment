//package com.corejava.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Demonstrates multiple multithreading concepts in one file
public class Multithreading {

    // volatile ensures visibility of changes across threads
    private volatile boolean running = true;

    // instance variable (not thread-safe without synchronization)
    private int count = 0;

    public static void main(String[] args) {

        Multithreading demo = new Multithreading();

        // Creating thread using Runnable
        Thread t1 = new Thread(new Task(demo));
        Thread t2 = new Thread(new Task(demo));

        t1.start();
        t2.start();

        // Thread Pool Executor
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new PoolTask());
        executor.execute(new PoolTask());
        executor.shutdown();

        // Stopping thread using volatile variable
        new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            demo.stopRunning();
        }).start();
    }

    // synchronized method ensures thread safety for instance variable
    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " Count: " + count);
    }

    // synchronized block locks only critical section
    public void incrementWithBlock() {
        synchronized (this) {
            count++;
            System.out.println(Thread.currentThread().getName() + " Block Count: " + count);
        }
    }

    public void stopRunning() {
        running = false;
        System.out.println("Running stopped using volatile");
    }

    public boolean isRunning() {
        return running;
    }
}

// Runnable task demonstrating thread-safe access
class Task implements Runnable {

    Multithreading demo;

    Task(Multithreading demo) {
        this.demo = demo;
    }

    @Override
    public void run() {

        // local variable is thread-safe by default
        int localCounter = 0;

        while (demo.isRunning() && localCounter < 3) {
            demo.increment();          // synchronized method
            demo.incrementWithBlock(); // synchronized block
            localCounter++;
        }
    }
}

// Task executed by thread pool
class PoolTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Executing task by: " + Thread.currentThread().getName());
    }
}
