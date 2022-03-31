package creationalDesignPattern.factory;

public class MySqlDatabaseDriver extends DatabaseDriver{

    @Override
    public void connect() {
        System.out.println("Connection to MySql Database");
    }

    @Override
    public DatabaseDriver getConnection() {
        return new MySqlDatabaseDriver();
    }
//
//    @Override
//    public void query() {
//        System.out.println("Query to MySql Database");
//    }
//
//    @Override
//    public void close() {
//        System.out.println("Close to MySql Database");
//    }
}
