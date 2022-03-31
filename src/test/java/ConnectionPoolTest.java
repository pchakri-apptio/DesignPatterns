import creationalDesignPattern.Singleton.ConnectionPool;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ConnectionPoolTest {


    @Test
    public void test(){
        ConnectionPool pool1 = ConnectionPool.getInstance();
        ConnectionPool pool2 = ConnectionPool.getInstance();

        assertTrue("check for singleton if both objects are equal", pool1 == pool2);
    }

}
