package creationalDesignPattern.Singleton;

public class ConnectionPool {

    private static ConnectionPool INSTANCE = null; //we can go by eager loading but its not memory usage is not good
    private ConnectionPool(){}

    public static ConnectionPool getInstance(){
        if (INSTANCE == null) {
            synchronized (ConnectionPool.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ConnectionPool();
                }
            }
        }
       return INSTANCE;
    }
}

//if synchronized is used always there will be performance issue as threads will wait so use synchronized block
//to make better in use double checking above synch block
//other ways Enum,Inner static class