package creational.factory.bad;

public class App {
    public static void main(String[] args) {
        NotificationService service = new NotificationService("sms");
        service.notifyUser("Your OTP is 1234");
    }
}
