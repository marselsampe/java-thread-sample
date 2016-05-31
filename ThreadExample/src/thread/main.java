package thread;

public class main {

    public static void main(String[] args) {
        try {
            threadExample a = new threadExample("Thread 1");
            a.start();
            Thread.sleep(5000);
            threadExample b = new threadExample("Thread 2");
            b.start();
            Thread.sleep(5000);
            threadExample c = new threadExample("Thread 3");
            c.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
