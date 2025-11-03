package creational.factory.example;

public class DatabaseService {
    private final Database database;

    public DatabaseService(Database database) {
        this.database = database;
    }

    public void connect(String connectionString) {
        database.connect(connectionString);
    }
}
