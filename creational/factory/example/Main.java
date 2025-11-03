package creational.factory.example;

public class Main {
    public static void main(String[] args) {
        Database mysql = DatabaseFactory.createDatabase("mysql");
        DatabaseService mysqlService = new DatabaseService(mysql);
        mysqlService.connect("https://example.com");
    }
}
