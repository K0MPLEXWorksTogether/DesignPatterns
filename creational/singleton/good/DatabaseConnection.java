package creational.singleton.good;

public final class DatabaseConnection {
    private String connectionUri;
    private static DatabaseConnection connection;

    private DatabaseConnection(String url) {
        this.connectionUri = url;
    }

    public static DatabaseConnection getInstance(String url) {
        if (connection == null) {
            connection = new DatabaseConnection(url);
        }

        return connection;
    }

    public void connect() {
        System.out.printf("Connecting to: %s", this.connectionUri);
    }
}
