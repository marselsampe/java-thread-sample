
package runnable;

public class main {
    
    public static void main(String args[]){
        try {
            threadExample a = new threadExample("Thread 1");
            Thread.sleep(5000);
            threadExample b = new threadExample("Thread 2");
            Thread.sleep(5000);
            threadExample c = new threadExample("Thread 3");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
