// A class with a single responsibility to manage user data
class User {
    private String name;
    private String email;

    // Getter and setter methods for user details
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

// A class with a single responsibility to send email notifications
class EmailService {
    public void sendEmail(User user, String message) {
        // Logic to send an email
        System.out.println("Sending email to " + user.getEmail() + ": " + message);
    }
}

class SRP {
    public static void main(String[] args) {
        User user = new User();
        user.setName("John Doe");
        user.setEmail("john@doe.com");

        EmailService emailService = new EmailService();
        emailService.sendEmail(user, "Hello, John!");
    }
}