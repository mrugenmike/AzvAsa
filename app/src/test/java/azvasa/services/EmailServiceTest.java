package azvasa.services;

import com.sendgrid.SendGridException;
import org.junit.Test;

public class EmailServiceTest {

    @Test
    public void itShouldsendEmail() throws SendGridException {
        final EmailService emailService = new EmailService();
        emailService.sendEmail("prasadss.in@gmail.com","Cloud Watch Alert","<b>Hello From Admin</b>");
    }
}