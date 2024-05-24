package com.mkpits.concurrency;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		//ExecutorService is an interface that provides methods to manage the termination and execution of threads, 
		//and Executors is a factory class for creating ExecutorService instances.		
		
		for(int i =0;i<10;i++) {
			Runnable worker = new MyWorkerThread("task "+i);
			executor.execute(worker);
			//The execute method of the executor is called to submit each task for execution.

		}
		executor.shutdown();
		boolean var = executor.isTerminated();
		System.out.println(var);
		while(!executor.isTerminated()){}
		System.out.println("finished all threads ");
		
		//This while loop continuously checks if all tasks have completed execution. 
		//The isTerminated method returns true when all tasks have finished.
		//Once all tasks are done, it prints "finished all threads"
}

}
	
/*Flow Summary
-The Application class's main method is executed.

-A fixed thread pool with 3 threads is created.

-A loop creates and submits 10 tasks (MyWorkerThread instances) to the executor.

-The executor starts executing these tasks using its pool of threads.

-The main method initiates a shutdown of the executor and waits until all tasks are completed.

-Each MyWorkerThread prints its start message, sleeps for 10 seconds, and prints its end message.

-Once all tasks are done, "finished all threads" is printed to the console.

By using ExecutorService, the program efficiently manages the execution of
 multiple threads, reusing a fixed number of threads for multiple tasks.
 * */
