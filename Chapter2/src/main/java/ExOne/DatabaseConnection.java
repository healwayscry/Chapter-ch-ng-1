package ExOne;

public class DatabaseConnection {

    private static DatabaseConnection instance;
    private DatabaseConnection() {
        System.out.println("Ket noi vơi database thanh cong");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("dang ket noi database");
    }

    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        db1.connect();

        System.out.println(db1 == db2); // true
    }
}
