package creational.singleton.bad;

public class App {
    public static void main(String[] args) {
        DatabaseConnection db1 = new DatabaseConnection("jdbc:mysql://localhost:3306/app");
        db1.connect();

        DatabaseConnection db2 = new DatabaseConnection("jdbc:mysql://localhost:3306/app");
        db2.connect();
    }
}
