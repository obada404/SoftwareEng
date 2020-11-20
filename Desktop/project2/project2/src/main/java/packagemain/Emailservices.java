package packagemain;


import org.apache.log4j.*;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.List;
import java.util.Properties;

import static org.apache.log4j.Logger.getLogger;

public class Emailservices {
public void sendEmail( List <Apartment> result) {

    String to = "oday.qr.2001@gmail.com";

    // Mention the Sender's email address
    String from = "o.qasrawi@stu.najah.edu";
    Properties properties = System.getProperties();
    String host = "smtp.gmail.com";
    properties.put("mail.smtp.host", host);
    properties.put("mail.smtp.port", "465");
    properties.put("mail.smtp.ssl.enable", "true");
    properties.put("mail.smtp.auth", "true");
    Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
        @Override
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication("o.qasrawi@stu.najah.edu", "obada123456");
        }
    });
   
    session.setDebug(true);

    Logger log = getLogger(Emailservices.class.getName());
   try {
        
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
        
     
  
    	  message.setSubject("this is the sub");
    	  boolean f=(result==null);
    	 	  if (f) {
    		  message.setText("empty");
    	  }
     

    String h= result.toString() ==null ?"empty" :result.toString();










       log.info("sending...");
        // Send message
        Transport.send(message);
       log.info("Sent message successfully....");
    } catch (MessagingException mex) {
       log.info("MessagingException");


    }
	
	

	
	
	
	
}


}
