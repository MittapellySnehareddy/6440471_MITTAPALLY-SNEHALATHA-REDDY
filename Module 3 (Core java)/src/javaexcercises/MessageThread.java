package javaexcercises;
class MessageThread extends Thread {
    String message;

    MessageThread(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message + " - " + i);
        }
    }

    public static void main(String[] args) {
        MessageThread thread1 = new MessageThread("Thread 1 is running");
        MessageThread thread2 = new MessageThread("Thread 2 is running");

        thread1.start();
        thread2.start();
    }
}
