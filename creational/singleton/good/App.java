package creational.singleton.good;

public class App {
    public static void main(String[] args) {
        DatabaseConnection db = DatabaseConnection.getInstance("jdbc:mysql://localhost:3306/app");
        db.connect();

        DatabaseConnection sameDb = DatabaseConnection.getInstance("jdbc:mysql://localhost:3306/app");
        sameDb.connect();

        // The two references will be the same
        System.out.println(db == sameDb); 
    }
}
