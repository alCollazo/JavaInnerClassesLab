package collazo.albert;
import java.io.Closeable;


public interface Connection extends Closeable{

    public void close();

    public String getIP();

    public int getPort();

    public String getProtocol();

    public String connect();


}
