package br.com.server.main.interfaces;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * @author Silvio Cezar Saczuck
 */
public interface IServerConnect {
     /**
      *
      * @param port
      * @return ServerSocket
      * @throws IOException
      */
     ServerSocket startServer(int port) throws IOException;
}
