package br.com.server.main.interfaces;

import java.io.IOException;
import java.net.ServerSocket;
/**
 * @author Silvio Cezar Saczuck
 */
public interface IServerListener {
     /**
      *
      * @param socket
      * @throws IOException
      */
     void startListener (ServerSocket socket) throws IOException;
}
