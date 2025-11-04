import exempleMock.EmailService;
import exempleMock.MailSender;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

class EmailServiceTest {

    private MailSender mailSender;   // Mock
    private EmailService emailService;

    @BeforeEach
    void setUp() {
        // On crée un mock de MailSender
        mailSender = mock(MailSender.class);
        emailService = new EmailService(mailSender);
    }

    @Test
    void testSendWelcomeEmailSuccess() {
        String email = "user@example.com";

        // Quand on appelle sendWelcomeEmail
        emailService.sendWelcomeEmail(email);

        // On vérifie que le mail a bien été envoyé via le mock
        verify(mailSender).sendEmail(
                eq("user@example.com"),
                eq("Bienvenue !"),
                eq("Bonjour, merci de votre inscription.")
        );
    }

    @Test
    void testSendWelcomeEmailWithEmptyEmailThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            emailService.sendWelcomeEmail("");
        });

        // Le mock ne doit jamais être appelé
        verify(mailSender, never()).sendEmail(any(), any(), any());
    }
}
