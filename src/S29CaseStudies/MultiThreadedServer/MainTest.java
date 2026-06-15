package S29CaseStudies.MultiThreadedServer;

public class MainTest {
    public static void main(String[] args) {
        MultiThreadedServer server = new MultiThreadedServer(8080);
        Thread serverThread = new Thread(server::startServer);
        serverThread.start();
        try{
            serverThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
