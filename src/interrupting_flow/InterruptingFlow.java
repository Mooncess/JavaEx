package interrupting_flow;

public class InterruptingFlow {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        try {
            Thread.sleep(5000); // ждем 5 секунд
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt(); // прерываем выполнение потока
    }
}

class MyThread extends Thread {

    public void run() {
        while(!isInterrupted()) {
            try {
                System.out.println("Работаю...");
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("zzz...");
                return;
            }
        }
        System.out.println("Thread has been interrupted.");
    }
}

