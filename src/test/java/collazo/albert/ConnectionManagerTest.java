package collazo.albert;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class ConnectionManagerTest {

    ConnectionManager connectionManager;



    @Before
    public void setUp() {

        connectionManager = new ConnectionManager();


    }
    @Test
    public void createConnectionTest1(){
        connectionManager.createNewConnection("198.126.1.1",2);
        connectionManager.createNewConnection("198.126.1.2",3);
        Integer expected = 2;
        Integer actual = connectionManager.connections.size();
        assertEquals(expected, actual);
    }

    @Test
    public void createConnectionTest2(){
        connectionManager.createNewConnection("198.126.1.1",2,"Benghazi");
        Integer expected = 1;
        Integer actual = connectionManager.connections.size();
        assertEquals(expected, actual);

    }





}
