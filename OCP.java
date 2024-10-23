// Notification interface
interface Notification {
    void send(String message);
}

// Email notification implementation
class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}

// SMS notification implementation
class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

// A class to send notifications without modifying its existing code
class NotificationService {
    private Notification notification;

    public NotificationService(Notification notification) {
        this.notification = notification;
    }

    public void notifyUser(String message) {
        notification.send(message);
    }
}

// Usage
public class OCP {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();

        NotificationService emailService = new NotificationService(email);
        emailService.notifyUser("Hello via Email!");

        NotificationService smsService = new NotificationService(sms);
        smsService.notifyUser("Hello via SMS!");
    }
}
