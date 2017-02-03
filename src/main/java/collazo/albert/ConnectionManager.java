package collazo.albert;

import java.util.ArrayList;

public class ConnectionManager {

    public ArrayList<ManagedConnection> connections = new ArrayList<ManagedConnection>();

    public final int CONNECTION_MAX = 4;
    public int connectionCount = connections.size();

    public void createNewConnection(String ip, int port){

        if(CONNECTION_MAX != connectionCount){
            ManagedConnection managedConnection2 = new ManagedConnection(ip, port);

        connections.add(managedConnection2);

        connectionCount ++;}
    }

    public void createNewConnection(String ip, int port, String protocol){

        if(CONNECTION_MAX != connectionCount){

        ManagedConnection managedConnection = new ManagedConnection(ip, port, protocol);

        connections.add(managedConnection);

        connectionCount ++;}
    }


    private class ManagedConnection implements Connection{
       private String ip;
       private int port;
       private String protocol;



        ManagedConnection(String ip, int port, String protocol){
            this.ip = ip;
            this.port = port;
            this.protocol = protocol;
        }

        ManagedConnection(String ip, int port){
            this.ip = ip;
            this.port = port;
        }

        boolean connectionOpenOrClose = false;

        public void close(){

            this.connectionOpenOrClose = true;

        }
        public String getIP(){
            return ip;
        }

        public int getPort(){
            return port;
        }

        public String getProtocol(){
            return protocol;
        }

        public String connect(){

            return "This Connection is active";
        }

    }
}
