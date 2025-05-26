public class VirtualThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> System.out.println("Running in virtual thread: " + Thread.currentThread());

        Thread vt = Thread.startVirtualThread(task);

        vt.join();
    }
}
