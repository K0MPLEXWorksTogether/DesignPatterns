package creational.factory.example;

public class DatabaseFactory {
    public static Database createDatabase(String type) throws IllegalArgumentException{
        if (type.equalsIgnoreCase("mysql")) {
            return new MySQLDatabase();
        } else if (type.equalsIgnoreCase("postgresql")) {
            return new PostgreSQLDatabase();
        } else {
            throw new IllegalArgumentException("Unknown database type.");
        }
    } 
}
