package S29CaseStudies.MultiThreadedServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadedServer {
    private final int port;

    public MultiThreadedServer(int port){
        this.port = port;
    }

    public void startServer(){
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        try (ServerSocket serverSocket = new ServerSocket(port)){
            System.out.println("System is running on port: " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                threadPool.submit(new ClientHandler(clientSocket));
            }
        } catch (IOException e){
            System.out.println("Server error: " + e.getMessage());
        }
    }
}
