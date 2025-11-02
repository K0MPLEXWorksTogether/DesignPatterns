package creational.singleton.bad;

public class DatabaseConnection {
    private String connectionUri;

    public DatabaseConnection(String url) {
        this.connectionUri = url;
    }

    public void connect() {
        System.out.printf("Connecting to: %s", this.connectionUri);
    }
}