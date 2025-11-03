package creational.factory.bad;

public class NotificationService {
    private Object notifier;

    public NotificationService(String type) throws IllegalArgumentException {
        if (type.equalsIgnoreCase("email")) {
            notifier = new EmailNotification();
        } else if (type.equalsIgnoreCase("sms")) {
            notifier = new SMSNotification();
        } else {
            throw new IllegalArgumentException("Unknown Notification Type.");
        }
    }
    
    public void notifyUser(String message) {
        if (notifier instanceof EmailNotification) {
            ((EmailNotification)notifier).send(message);
        } else if (notifier instanceof SMSNotification) {
            ((SMSNotification)notifier).send(message);
        }
    }
}
