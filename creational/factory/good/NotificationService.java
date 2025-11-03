package creational.factory.good;

public class NotificationService {
    private final Notification notifier;

    public NotificationService(Notification notifier) {
        this.notifier = notifier;
    }

    public void notifyUser(String message) {
        notifier.send(message);
    }
}
