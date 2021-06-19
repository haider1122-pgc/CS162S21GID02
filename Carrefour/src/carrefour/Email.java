package carrefour;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage; 

/**
 *
 * @author Haider
 */

public class Email {
    
    private String sender;
    private String password;
    private String reciever;
    private String message;
    private String Subject;

    public Email(String sender, String password, String reciever, String Subject, String message) {
        this.sender = sender;
        this.password = password;
        this.reciever = reciever;
        this.message = message;
        this.Subject = Subject;
    }
    
    
    /**
     * function used to send email
     */
    public boolean sendEmail(){
        boolean flag = false;
        // Recipient's email ID needs to be mentioned.
        String to = reciever;

        // Sender's email ID needs to be mentioned
        String from = sender;

        // Assuming you are sending email from through gmails smtp
        String host = "smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        // Get the Session object.// and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication(sender, password);

            }

        });

        // Used to debug SMTP issues
        session.setDebug(true);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject(this.Subject);

            // Now set the actual message
            message.setText(this.message);

            System.out.println("sending...");
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
            flag = true;
        } catch (MessagingException mex) {
        }
        return flag;

    }
    
}