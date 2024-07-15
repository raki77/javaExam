public class RunThreads implements Runnable{

    /**
     * @param args
     */
    public static void main(String[] args) {
     // TODO Auto-generated method stub
     RunThreads runner = new RunThreads();
     Thread alpha = new Thread(runner);
     Thread beta = new Thread(runner);
     alpha.setName("Alpha thread");
     beta.setName("Beta Thread");
     
     alpha.start();
     beta.start();
    }
    
    public void run() {
     for(int i=0; i<25; i++) {
      String threadName = Thread.currentThread().getName();
      System.out.println(threadName + " is running.");
     }
    }
   
}