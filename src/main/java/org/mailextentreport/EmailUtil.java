package org.mailextentreport;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;

public class EmailUtil {

    public static void sendEmailWithReport(String fromEmail, String password, String toEmail, String subject, String message, String reportFilePath) {

        // Set email properties
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Create a Session with the provided credentials
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        try {
            // Create a MimeMessage
            Message mimeMessage = new MimeMessage(session);
            mimeMessage.setFrom(new InternetAddress(fromEmail));
            mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            mimeMessage.setSubject(subject);

            // Create a MimeBodyPart for the email message
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(message);

            // Create a MimeBodyPart for the Extent Report attachment
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);

            // Attach the Extent Report to the email
            messageBodyPart = new MimeBodyPart();
            DataSource source = new FileDataSource(reportFilePath);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName("ExtentReport.html");
            multipart.addBodyPart(messageBodyPart);

            // Set the content of the email and send it
            mimeMessage.setContent(multipart);
            Transport.send(mimeMessage);

            System.out.println("Email sent successfully!");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
