package creational.factory.good;

public class App {
    public static void main(String[] args) {
        Notification notifier = new EmailNotification();
        NotificationService emailService = new NotificationService(notifier);
        emailService.notifyUser("Welcome to our App!");
    }
}
