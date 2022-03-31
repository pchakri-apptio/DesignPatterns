package factory;

import creationalDesignPattern.factory.DatabaseDriver;
import creationalDesignPattern.factory.DatabaseDriverFactory;
import creationalDesignPattern.factory.MySqlDatabaseDriver;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DatabaseDriverTest {

    DatabaseDriver driver = null;

    @Before
    public void setUp(){
        driver = new MySqlDatabaseDriver();
    }

    @Test
    public void DriverFactoryTest(){
        DatabaseDriver driver = DatabaseDriverFactory.createDriver("MySql");

        assertTrue("check if the driver provided the mySqlDriver",driver instanceof MySqlDatabaseDriver);
    }

    @Test
    public void DriverConnectTest(){
        assertTrue("check if the driver provided the mySqlDriver",driver.initalize() instanceof MySqlDatabaseDriver);
    }
}
