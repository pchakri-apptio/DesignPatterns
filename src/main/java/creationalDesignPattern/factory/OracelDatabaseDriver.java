package creationalDesignPattern.factory;

public class OracelDatabaseDriver extends DatabaseDriver{

    @Override
    public void connect() {
        System.out.println("Connection to Oracle Database");
    }

    @Override
    public DatabaseDriver getConnection() {
        return new OracelDatabaseDriver();
    }

//    @Override
//    public void query() {
//        System.out.println("Query to Oracle Database");
//    }
//
//    @Override
//    public void close() {
//        System.out.println("Close to Oracle Database");
//    }
}
