package exempleMock;


public class EmailService {

    private final MailSender mailSender;

    public EmailService(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    /**
     * Envoie un email de bienvenue à un nouvel utilisateur.
     * Si l'adresse est vide, ne fait rien.
     */
    public void sendWelcomeEmail(String email) {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be empty");
        }

        String subject = "Bienvenue !";
        String body = "Bonjour, merci de votre inscription.";

        mailSender.sendEmail(email, subject, body);
    }
}
