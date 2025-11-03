package creational.factory.example;

public class MySQLDatabase implements Database{
    public void connect(String connectionString) {
        System.out.println("Connecting MySQL to: " + connectionString);
    }
}
