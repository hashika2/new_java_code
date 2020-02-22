package multithread;

//class RunnableDemo implements Runnable {
//	   private Thread t;
//	   private String threadName;
//	   
//	   RunnableDemo( String name) {
//	      threadName = name;
//	      System.out.println("Creating " +  threadName );
//	   }
//	   
//	   public void run() {
//	      System.out.println("Running " +  threadName );
//	      try {
//	         for(int i = 4; i > 0; i--) {
//	            System.out.println("Thread: " + threadName + ", " + i);
//	            // Let the thread sleep for a while.
//	            Thread.sleep(50);
//	         }
//	      } catch (InterruptedException e) {
//	         System.out.println("Thread " +  threadName + " interrupted.");
//	      }
//	      System.out.println("Thread " +  threadName + " exiting.");
//	   }
//	   
//	   public void start () {
//	      System.out.println("Starting " +  threadName );
//	      if (t == null) {
//	         t = new Thread (this, threadName);
//	         t.start ();
//	      }
//	   }
//	}

	public class MultiThread {

	   public static void main(String args[]) throws InterruptedException {
	     MyThread t=new MyThread();
	     MyThread2 t2=new MyThread2();
	     t.start();
	     t2.start();
	     //System.out.println("2334");
	   }   
	}
	
	class MyThread extends Thread {
		public void run(){
			try {
				for(int i=0;i<5;i++) {
					System.out.println("hello");
					Thread.sleep(500);
				}
			}catch(Exception e) {
				
			}
			
		 }
	}
	class MyThread2 extends Thread {
		public void run(){
			try {
				for(int i=0;i<5;i++) {
					System.out.println("haii");
					Thread.sleep(1000);
				}
			}catch(Exception e) {
				
			}
		 }
	}
