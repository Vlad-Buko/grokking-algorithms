package pl.bel.inheritance;

public class ThreadBook {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread();
        thread.join();
        try {
            thread.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class Read implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello");
    }
}
