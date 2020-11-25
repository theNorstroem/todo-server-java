package pro.furo.todo;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.util.Arrays;
import java.util.logging.Logger;
import pro.furo.todo.impl.task.TaskServiceImpl;

public class TodoServer {

   private static final Logger logger = Logger.getLogger(TodoServer.class.getName());

   private int port = 7777;
   private Server server;

   private void start() throws Exception {
      logger.info("Starting the grpc todo server");

      server = ServerBuilder.forPort(port)
            .addService(new TaskServiceImpl())
            .build()
            .start();

      logger.info("Server started. Listening on port " + port);
   }

   private void stop() {
      if (server != null) {
         server.shutdown();
      }
   }

   public static void main(String[] args) throws Exception {
      logger.info("Server startup. Args = " + Arrays.toString(args));
      final TodoServer BffServer = new TodoServer();

      BffServer.start();
      BffServer.blockUntilShutdown();
   }

   private void blockUntilShutdown() throws InterruptedException {
      if (server != null) {
         server.awaitTermination();
      }
   }
}
