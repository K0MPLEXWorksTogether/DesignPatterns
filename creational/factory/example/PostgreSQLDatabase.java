package creational.factory.example;

public class PostgreSQLDatabase implements Database{
    public void connect(String connectionString) {
        System.out.println("Connecting PostGreSQL to: " + connectionString);
    }
}
