package creationalDesignPattern.factory;

public class DatabaseDriverFactory {

    public static DatabaseDriver createDriver(String type){

        if(type == "MySql"){
            return new MySqlDatabaseDriver();
        }
        else if(type == "Oracel"){
            return new OracelDatabaseDriver();
        }
        else{
            return null;
        }
    }
}
