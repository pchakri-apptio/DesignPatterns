package creationalDesignPattern.factory;

public abstract class DatabaseDriver {

    public DatabaseDriver initalize(){
        DatabaseDriver driver = getConnection();
        driver.connect();
        return driver;
    }

    public abstract void connect();
//    public void query();
//    public void close();

    public abstract DatabaseDriver getConnection();
}
