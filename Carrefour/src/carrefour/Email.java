/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    private String recever;
    private String subject;
    private String message;
    
    //setters
    
    /**
     * setter for sender email
     * @param sender 
     */
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * setter for receiver email
     * @param recever 
     */
    public void setRecever(String recever) {
        this.recever = recever;
    }

    /**
     * setter for subject of mail
     * @param subject 
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * setter for message
     * @param message 
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    
    /**
     * function used to send email
     */
    public void sendEmail(){
        // Recipient's email ID needs to be mentioned.
        String to = "haider441ali@gmail.com";

        // Sender's email ID needs to be mentioned
        String from = "haider441ali@gmail.com";

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

                return new PasswordAuthentication("haider441ali@gmail.com", "HA12@@al");

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
            message.setSubject("This is the Subject Line!");

            // Now set the actual message
            message.setText("This is actual message");

            System.out.println("sending...");
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
        }

    }
    
}
        
    
