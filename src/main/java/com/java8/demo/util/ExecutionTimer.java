package com.java8.demo.util;

public class ExecutionTimer {
	
    public void execute(Runnable runnable){
    	long start = System.nanoTime();
    	
    	runnable.run();
    	
    	long end = System.nanoTime();
    	
    	System.out.println("Execution time : "+ (end-start)/1000000000);
    }
}
