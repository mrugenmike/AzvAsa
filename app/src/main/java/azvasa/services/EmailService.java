package azvasa.services;

import com.sendgrid.SendGrid;
import com.sendgrid.SendGridException;
import org.springframework.stereotype.Component;

@Component
public class EmailService  {
    public final SendGrid sendgrid = new SendGrid("mrugen.deshmukh@sjsu.edu","emailking@123");
    public void sendEmail(String emailId,String subject,String htmlBody) throws SendGridException {
        SendGrid.Email email = new SendGrid.Email();
        email.addTo(emailId);
        email.setFrom("admin@azvasa.com");
        email.setSubject(subject);
        email.setHtml(htmlBody);
        sendgrid.send(email);
    }
}
